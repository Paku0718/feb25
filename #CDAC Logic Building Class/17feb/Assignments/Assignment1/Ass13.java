import java.util.Scanner;

public class Ass13 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input first number: ");
        	double firstNumber = scanner.nextInt();
        
        	System.out.print("Input second number: ");
        	double secondNumber = scanner.nextInt();
        
        	System.out.print("Input third number: ");
        	double thirdNumber = scanner.nextInt();

		double avg= (firstNumber + secondNumber + thirdNumber) / 3;
		System.out.println("The average is : " + avg);

		

	}
}