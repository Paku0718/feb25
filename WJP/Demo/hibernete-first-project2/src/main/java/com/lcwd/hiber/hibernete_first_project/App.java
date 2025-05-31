package com.lcwd.hiber.hibernete_first_project;

import org.hibernate.SessionFactory;

import com.lcwd.hiber.util.Hibernateutil;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=Hibernateutil.getSessionFactory();
        System.out.println(sessionFactory);
    }
}
