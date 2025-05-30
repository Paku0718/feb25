package com.cdac.tester;
import java.util.Scanner;
import java.sql.Date;
import com.cdac.dao.UserDaoImpl;
import com.cdac.pojos.User;
public class TestLayeredApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in);
			//1.create dao instance -create dependency
			UserDaoImpl dao=new UserDaoImpl()) {
			
			boolean exit = false;
			
			while (!exit) {
                System.out.println("1. Sign In\n2. Register User\n3. Change Password\n4. Delete User\n5. Exit");
                switch (sc.nextInt()) {
                    case 1:
                        System.out.print("Enter email and password: ");
                        User user = dao.signIn(sc.next(), sc.next());
                        System.out.println(user != null ? "Login successful!\n" + user : "Login failed.");
                        break;
                    case 2:
                        System.out.println("Enter firstName, lastName, email, password, dob(yyyy-mm-dd), status(true/false), role:");
                        User newUser = new User(0, sc.next(), sc.next(), sc.next(), sc.next(), Date.valueOf(sc.next()), sc.nextBoolean(), sc.next());
                        System.out.println(dao.registerUser(newUser));
                        break;
                    case 3:
                        System.out.println("Enter email, old password, new password:");
                        System.out.println(dao.changePassword(sc.next(), sc.next(), sc.next()));
                        break;
                    case 4:
                        System.out.println("Enter user id to delete:");
                        System.out.println(dao.deleteUser(sc.nextInt()));
                        break;
                    case 5:
                        exit = true;
                        dao.close();
                        System.out.println("Goodbye!");
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
