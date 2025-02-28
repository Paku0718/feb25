import java.util.Scanner;

public class Ass19 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input base number : ");
		int firstNumber = scanner.nextInt();
		
		System.out.print("Input exponent number : ");
		int secondNumber = scanner.nextInt();	
		long result=1;
		for(int i=1; i<=secondNumber;i++){
			result = result * firstNumber;
		}
		
		System.out.print(firstNumber + " raise to the power " + secondNumber + "is " + result);
	
		
	}
}