public class BinaryStringExample {
    public static void main(String[] args) {
        int number = 10; // Example number
        String binaryString = String.format("%32s", Integer.toBinaryString(number)).replace(' ', '0');
        
        System.out.println("Binary representation (32-bit): " + binaryString);
    }
}
