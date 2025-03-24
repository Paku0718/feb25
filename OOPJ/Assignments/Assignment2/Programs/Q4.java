import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Check if a number is divisible by 3 without using % or /");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        boolean isDivisibleBy3 = isDivisibleByThree(num);
        System.out.println(num + " is " + (isDivisibleBy3 ? "" : "not ") + "divisible by 3");
        
        scanner.close();
    }
    
    private static boolean isDivisibleByThree(int n) {
       
        if (n < 0) {
            n = -n;
        }  
        
        if (n == 0) {
            return true;
        }
       
        if (n == 1 || n == 2) {
            return false;
        }
        
        int sum = 0;
        while (n > 0) {
            sum += n & 0xF;
            n = n >> 4;    
        }
        
        return isDivisibleByThree(sum);
    }
}