package com.crick.apis.repos;

import com.crick.apis.entites.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    //match fetch provide team Name
    Optional<Match> findByTeamHeading(String teamHeading);

}
