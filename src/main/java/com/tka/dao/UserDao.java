package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.User;

@Repository
public class UserDao {
	@Autowired
	private SessionFactory factory;

	public boolean logincheck(User user) {
		
		System.out.println("in dao");
		
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		
		Criteria criteria = openSession.createCriteria(User.class);
		criteria.add(Restrictions.eq("usname", user.getUsname()));
		criteria.add(Restrictions.eq("password", user.getPassword()));
		
		List<User> list = criteria.list();
		System.out.println(list);
		 
		if (list != null && list.size()==1) {
			return true;
		}
		else
		{
			return false;
		}
	}

}
