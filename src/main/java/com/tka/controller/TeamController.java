package com.tka.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Team;
import com.tka.service.TeamService;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @PostMapping("/addteam")
    public Team createTeam(@RequestBody Team team) {
        return teamService.createTeam(team);
    }

    @GetMapping("/{id}")
    public Team getTeamById(@PathVariable Long id) {
        return teamService.getTeamById(id);
    }

    @GetMapping("/allteams")
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }
    
    @PutMapping("/updateteam")
    public String updateteam(@RequestBody Team team)
    {
    	return teamService.updateteam(team);
    }
    
    @DeleteMapping("/deleteteam/{id}")
    public String deleteteam(@PathVariable("id") Long id)
    {
    	return teamService.deleteteam(id);
    }
}
