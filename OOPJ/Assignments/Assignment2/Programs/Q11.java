import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Check if a number is a power of 2 using bitwise operators");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);
        
        System.out.println(n + " is " + (isPowerOfTwo ? "" : "not ") + "a power of 2");
        
    }
}