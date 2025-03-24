import java.util.Scanner;

public class Q22{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter second number: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter operator form +, -, *, / : ");
		char operator = sc.next().charAt(0);
		
		double result=0;
		
		switch(operator){
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default: 
				System.out.println("Invalid operator");
		}
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result );
	}
}