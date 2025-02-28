import java.util.Scanner;

public class Ass8 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input first number :");
		int firstNumber = scanner.nextInt();
		

		System.out.println("Input second number :");
		int secondNumber = scanner.nextInt();
		
		System.out.println("Before swapping : ");
		System.out.println("First number: " + firstNumber);
		System.out.println("Second number: " + secondNumber);
			
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;

		System.out.println("After swapping : ");
		System.out.println("First number: " + firstNumber);
		System.out.println("Second number: " + secondNumber);
		
		

	}
}