//package defaultt;
//
//public class TestDemo {
//
//	public static void main(String[] args) {
//		System.out.println("Welcome java");
//		System.out.println("Welcome java");
//		System.out.println("Welcome java");
//
//	}
//
//}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

class Cricketer{
    String Name;
    int Age;
    String Team;
    int RunsScored;
    
    Cricketer(){
        this("Unknown", 0, "Not Assigned", 0);
    }
    
    Cricketer(String name, int age){
        this(name, age, "Not Assigned", 0);
    }    

    Cricketer(String name, int age, String team, int runsscored){
        this.Name =name;
        this.Age =age;
        this.Team =team;
        this.RunsScored = runsscored;
    }
    
    void displayDetails(){
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Team: " + Team);
        System.out.println("Runs Scored: " + RunsScored);
    }
}

 class TestDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        Cricketer c1 = new Cricketer(name, age);
        c1.displayDetails();
        
        name = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine();
        String team = sc.nextLine();
        int runsscored = sc.nextInt();
        
        Cricketer c2 = new Cricketer(name, age, team, runsscored);
        c2.displayDetails();
    }
}