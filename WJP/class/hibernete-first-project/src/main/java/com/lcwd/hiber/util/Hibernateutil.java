package com.lcwd.hiber.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.lcwd.hiber.entities.Students;

public class Hibernateutil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("/hibernate.cfg.xml");
            configuration.addAnnotatedClass(Students.class);

            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
