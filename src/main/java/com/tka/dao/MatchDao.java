package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.tka.entity.Matches;

@Repository
public class MatchDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Matches save(Matches matches) {
		
		Session session = sessionFactory.openSession();
		session.save(matches);
		return matches;
	}

	public Matches findById(Long id) {
		Session session = sessionFactory.openSession();
		return session.get(Matches.class, id);
	}

	public List<Matches> findAll() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Matches.class);
		return criteria.list();
	}
	
	 public String updatematch( Matches matches)
	    {
	    	Session s = sessionFactory.openSession();
	    	Transaction t = s.beginTransaction();
	    	
	    	s.update(matches);
	    	t.commit();

	    	return "updated";
	    }
	 
	 public String deletematch(Long id)
	 {
		 Session s = sessionFactory.openSession();
		 Transaction t = s.beginTransaction();
		 
		 Matches match = s.get(Matches.class, id);
		 
		 s.delete(match);
		 t.commit();
		 
		 return "deleted";
	 }
}
