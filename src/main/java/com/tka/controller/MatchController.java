package com.tka.controller;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Matches;
import com.tka.entity.Team;
import com.tka.service.MatchService;

@RestController
@RequestMapping("/matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @PostMapping("/addmatch")
    public Matches createMatch(@RequestBody Matches matches) {
        return matchService.createMatch(matches);
    }

    @GetMapping("/{id}")
    public Matches getMatchById(@PathVariable Long id) {
        return matchService.getMatchById(id);
    }

    @GetMapping
    public List<Matches> getAllMatches() {
        return matchService.getAllMatches();
    }
    
    @PutMapping("/updatematch")
    public String updatematch(@RequestBody Matches matches)
    {
    	return matchService.updatematch(matches);
    }
    
    @DeleteMapping("/deletematch/{id}")
    public String deletematch(@PathVariable("id") Long id)
    {
		return matchService.deletematch(id);
    }
    
    
}
