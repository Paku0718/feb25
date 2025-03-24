import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Multiply a number by 8 using left shift operator");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
       
        int result = number << 3;
        
        System.out.println(number + " * 8 = " + result);
        
        scanner.close();
    }
}