import java.util.Scanner;

public class Q18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student percentage: ");
		float percent = sc.nextFloat();
		
		String result = (percent>=40) ? "Pass" : "Fail";
		System.out.println("Result: " + result);
	}
}