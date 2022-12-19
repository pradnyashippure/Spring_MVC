package com.pradnya.myApp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pradnya.myApp.entity.MyAppRegDetails;

	@Repository
	public class DetailsDAOImpl implements DetailsDAO {
		
		@Autowired
		private SessionFactory sessionFactory;
        
		public void save(MyAppRegDetails details) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(details);
			transaction.commit();
			session.close();
		}

		public MyAppRegDetails getByEmail(String email) {
			Session session = sessionFactory.openSession();
			String que = "from MyAppRegDetails where email = '" + email + "'";
			Query query = session.createQuery(que);
			MyAppRegDetails entity = (MyAppRegDetails) query.getSingleResult();
			session.close();
			return entity;
		}
	}
