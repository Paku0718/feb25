import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Check if a number is even or odd using bitwise operators");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if ((num & 1) == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
        
        scanner.close();
    }
}