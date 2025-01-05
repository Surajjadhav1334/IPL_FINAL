package com.tka.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tka.dao.PlayerDao;
import com.tka.entity.Player;

@Service
public class PlayerService {

    @Autowired
    private PlayerDao playerDao;

    public Player createPlayer(Player player) {
        return playerDao.save(player);
    }

    public Player getPlayerById(Long id) {
        return playerDao.findById(id);
               
    }

    public List<Player> getAllPlayers() {
        return playerDao.findAll();
    }
    
    public String updateplayer( Player player)
    {
    	return playerDao.updateplayer(player);
    }
    
    public String deleteplayer(Long id)
    {
   	return playerDao.deleteplayer(id);
    }
}
