package com.crick.apis.controller;

import com.crick.apis.entities.Match;
import com.crick.apis.service.CricketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")

@CrossOrigin("*")
public class MatchController {
    @Autowired
    private CricketService cricketService;

    //get live matches
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(this.cricketService.getLiveMatches(), HttpStatus.OK);
    }

    //get history of matches
    @GetMapping("/history")
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.cricketService.getAllMatches(), HttpStatus.OK);
    }

    //get points table
    @GetMapping("/point-table")
    public ResponseEntity<?> getPointsTable(){
        return new ResponseEntity<>(this.cricketService.getPointsTable(), HttpStatus.OK);
    }

}
