package com.tka.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tka.dao.MatchDao;
import com.tka.entity.Matches;

@Service
public class MatchService {

    @Autowired
    private MatchDao matchDao;

    public Matches createMatch(Matches matches) {
        return matchDao.save(matches);
    }

    public Matches getMatchById(Long id) {
        return matchDao.findById(id);
               
    }

    public List<Matches> getAllMatches() {
        return matchDao.findAll();
    }
    
    public String updatematch( Matches matches)
    {
    	return matchDao.updatematch(matches);
    }
    
    public String deletematch( Long ud)
    {
    	return matchDao.deletematch(ud);
    }
    
}
