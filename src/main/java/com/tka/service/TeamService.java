package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tka.dao.TeamDao;
import com.tka.entity.Team;

@Service
public class TeamService {

	@Autowired
	private TeamDao teamDao;

	public Team createTeam(Team team) {
		return teamDao.save(team);
	}

	public Team getTeamById(Long id) {
		return teamDao.findById(id);

	}

	public List<Team> getAllTeams() {
		return teamDao.findAll();
	}
	
	public String updateteam( Team team)
    {
    	return teamDao.updateteam(team);
    }
	
	public String deleteteam(Long id)
    {
    	return teamDao.deleteteam(id);
    }
}
