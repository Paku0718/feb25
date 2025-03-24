import java.util.Scanner;

public class Q21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int increment = -~num;
		
		System.out.println("The incremented number is: " + increment);
	}
}