import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Swap two numbers using += and -= operators");
        System.out.print("Enter first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();
        
        System.out.println("Before swap: x = " + x + ", y = " + y);
        
        x += y;
        y = x - y;
        x -= y;
        
        System.out.println("After swap: x = " + x + ", y = " + y);
        
        scanner.close();
    }
}