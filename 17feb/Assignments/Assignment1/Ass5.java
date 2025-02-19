import java.util.Scanner;

public class Ass5 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first number");
		int firstNumber = scanner.nextInt();
		

		System.out.print("Input second number");
		int secondNumber = scanner.nextInt();

		int product = firstNumber * secondNumber;
		
		System.out.println(firstNumber + " X " + secondNumber + " = " + product);
		
		
	
	}
}