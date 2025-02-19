import java.util.Scanner;

public class Ass11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();
        
        System.out.print("Input third number: ");
        int thirdNumber = scanner.nextInt();
        
        int largest;
        
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            largest = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            largest = secondNumber;
        } else {
            largest = thirdNumber;
        }
        
        System.out.println("The largest number is " + largest);
        
    }
}
