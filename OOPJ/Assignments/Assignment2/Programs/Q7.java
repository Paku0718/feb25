import java.util.Scanner;

public class Q7 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		
		int leapYear = (year % 4==0 && year %100!=0) || (year % 400 == 0);
		
		if(leapYear){
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}
}
