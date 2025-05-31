package com.lcwd.hiber.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lcwd.hiber.entities.Certificate;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	static {
		try {
			if(sessionFactory==null) {
				sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Certificate.class) .buildSessionFactory();
			}
		}
		catch(Exception e) {
			throw new RuntimeException("Error in creating session factory" + e.getMessage());
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
