package com.tka.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tka.entity.Team;

@Repository
public class TeamDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Team save(Team team) {
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(team);
        return team;
    }

    public Team findById(Long id) {
        Session session = sessionFactory.openSession();
        return session.get(Team.class, id);
    }

    public List<Team> findAll() {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Team.class);
		return criteria.list();
    }
    
    public String updateteam(@RequestBody Team team)
    {
    	Session s = sessionFactory.openSession();
    	Transaction t = s.beginTransaction();
    	
    	s.update(team);
    	
    	t.commit();
    	return "updated";
    }
    
    public String deleteteam(@PathVariable("id") Long id)
    {
    	Session openSession = sessionFactory.openSession();
    	Transaction beginTransaction = openSession.beginTransaction();
    	
    	Team team = openSession.get(Team.class, id);
    	
    	openSession.delete(team);
    	
    	beginTransaction.commit();
    	
    	return "deleted";
    }
}
