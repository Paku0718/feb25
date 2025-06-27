package com.lcwd.hiber;

import com.lcwd.hiber.entities.Student;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	StudentService studentService = new StudentService();
    public void getStudentTest() {
    	Student student = studentService.getById(1);
    	System.out.println(student.getName());

    	System.out.println(student.getCertificates().size());
    }
}
