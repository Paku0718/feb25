import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Count the number of set bits (1s) in binary representation");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int originalNum = num;
        int count = 0;
        
        while (num > 0) {
            num &= (num - 1);
            count++;
        }
        
        System.out.println("Binary representation of " + originalNum + " has " + count + " set bits");
        System.out.println("Binary: " + Integer.toBinaryString(originalNum));
        
        scanner.close();
    }
}