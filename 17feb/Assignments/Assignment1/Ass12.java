import java.util.Scanner;

public class Ass12 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number :");
		int number = scanner.nextInt();
		int originalNumber = number;
		
		int reverse = 0;
		while (number != 0){
			int digit = number % 10;
            		reverse = reverse * 10 + digit;
            		number /= 10;
		}
		
		System.out.println("The reverse of " + originalNumber + " is " + reverse);
		
	}
}