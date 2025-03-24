
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("\nArithmetic Operations:");
        System.out.println(a + " + " + b + " = " + (a + b)); 
        System.out.println(a + " - " + b + " = " + (a - b)); 
        System.out.println(a + " * " + b + " = " + (a * b)); 
		
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
            System.out.println(a + " % " + b + " = " + (a % b)); 
        } else {
            System.out.println("Division and Modulus by zero are not allowed.");
        }
		
        scanner.close();
    }
}