import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int reversed = 0;
        
        while(number != 0) {
            int digit = number % 10;      
            reversed = reversed * 10 + digit;  
            number /= 10;           
        }
        
        System.out.println("Original: " + originalNumber);
        System.out.println("Reversed: " + reversed);
        
    }
}