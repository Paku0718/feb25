package com.lcwd.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lcwd.hiber.entities.Certificate;
import com.lcwd.hiber.entities.Student;
import com.lcwd.hiber.util.HibernateUtil;



/**
 * Hello world!
 *
 */ 
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
    	System.out.println("We are learning Hibernate");
    	
    	//student create
    	//save :hibernate
    	
    	//create student object
    	Student student = new Student();
    	student.setName("Kunal Kurnajekar");
    	student.setCollege("Raisoni");
    	student.setActive(true);
    	student.setPhone("124568");
    	student.setAbout("This is geinune student");
    	student.setFatherName("Dhananjay");
    	
    	Certificate certificate = new Certificate();
    	certificate.setTitle("This is java certification");
    	certificate.setLink("link");
    	certificate.setStudent(student);
    	
    	
    	Certificate certificate1 = new Certificate();
    	certificate1.setTitle("This is python certification");
    	certificate1.setLink("link");
    	certificate1.setStudent(student);
    	
    	student.getCertificates().add(certificate);
    	student.getCertificates().add(certificate1);
    	
    	
    	SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
    	System.out.println(sessionfactory);
    	
    	Session session = sessionfactory.openSession();
    	
    	Transaction transaction = null;
    	
    	try {
    		transaction = session.beginTransaction();
    		session.persist(student);
    		
    		transaction.commit();
    		System.out.println("Student saveed sucessufully");
    		
    		
    	}	
    	catch(Exception e) {
    		if(transaction!=null) {
    			transaction.rollback();
    		}
    		e.printStackTrace();
    		
    	}finally {
    		session.close();
    	}
    }
}
