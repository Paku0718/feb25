import java.util.Scanner;

public class Ass6 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first number :");
		int firstNumber = scanner.nextInt();
		

		System.out.print("Input second number :");
		int secondNumber = scanner.nextInt();
		
		int sum = firstNumber + secondNumber;
		int multiplication = firstNumber * secondNumber;	
		int substraction = firstNumber - secondNumber;
		int division = firstNumber / secondNumber;
		int remainder = firstNumber % secondNumber;
		
		System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
		System.out.println(firstNumber + " X " + secondNumber + " = " + multiplication);
		System.out.println(firstNumber + " - " + secondNumber + " = " + substraction);
		System.out.println(firstNumber + " / " + secondNumber + " = " + division);		
		System.out.println(firstNumber + " % " + secondNumber + " = " + remainder);		

	}
}