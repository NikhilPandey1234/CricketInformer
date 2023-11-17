package com.crick.apis.services;

import com.crick.apis.entites.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    //get all matches
    List<Match> getAllMatches();

    //get Live Match
    List<Match> getLiveMatches();

    //get cwx2023 latest point table

    List<List<String>> getPointTable();
}
