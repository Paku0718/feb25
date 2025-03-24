import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Swap two numbers using XOR (without third variable or +/-)");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("After swap: a = " + a + ", b = " + b);
        
        scanner.close();
    }
}