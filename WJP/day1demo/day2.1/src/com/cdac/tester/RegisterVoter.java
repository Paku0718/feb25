package com.cdac.tester;

import java.util.Scanner;
import java.sql.Date;

import com.cdac.dao.UserDaoImpl;
import com.cdac.pojos.User;

public class RegisterVoter {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 1.create dao instace - create dependency
			UserDaoImpl dao = new UserDaoImpl();
			// accept em n password
			System.out.println("Enter firstName, lastName, email, password, dob");
		
			User user = new User(sc.next(), sc.next(), sc.next(), sc.next(), Date.valueOf(sc.next()));
			
			System.out.println("Reg status -" + dao.signUp(user));
			//clean up
			dao.cleanUp();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
