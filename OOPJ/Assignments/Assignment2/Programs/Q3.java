import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculate sum of digits using modulus and division");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        int originalNumber = n;
        
        while (n > 0) {
            sum += n % 10;  
            n /= 10;        
        }
        
        System.out.println("Sum of digits in " + originalNumber + " is " + sum);
        
        scanner.close();
    }
}