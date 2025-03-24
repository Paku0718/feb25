import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Swap odd and even bits in a number");
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        
      
        int evenBits = (x & 0xAAAAAAAA) >> 1;
        int oddBits = (x & 0x55555555) << 1;
        
        int result = evenBits | oddBits;
        
        System.out.println("Original: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
        System.out.println("After swapping odd and even bits: " + result + " (Binary: " + Integer.toBinaryString(result) + ")");
        
       
    }
}