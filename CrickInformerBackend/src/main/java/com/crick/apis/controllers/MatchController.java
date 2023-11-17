package com.crick.apis.controllers;

import com.crick.apis.entites.Match;
import com.crick.apis.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    private MatchService matchService;

    //get Live matches
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches()
    {
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }

    //get All matches
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches()
    {
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }

    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable() {
        return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
    }
}
