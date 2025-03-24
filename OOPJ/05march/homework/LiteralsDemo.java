public class LiteralsDemo {
    public static void main(String[] args) {
        
        int binaryNum = 0b1010; // 10 in decimal
        
        int octalNum = 012; // 10 in decimal

        int hexNum = 0xA; // 10 in decimal
		
        float floatNum = 10.5f; // 'f' or 'F' is required for float
        double doubleNum = 20.99; // By default, a floating-point number is double

        
        double expNum = 1.2e3; // 1.2 * 10^3 = 1200.0

        
        System.out.println("Binary Literal (0b1010) = " + binaryNum);
        System.out.println("Octal Literal (012) = " + octalNum);
        System.out.println("Hexadecimal Literal (0xA) = " + hexNum);
        System.out.println("Float Literal (10.5f) = " + floatNum);
        System.out.println("Double Literal (20.99) = " + doubleNum);
        System.out.println("Exponential Notation (1.2e3) = " + expNum);
    }
}