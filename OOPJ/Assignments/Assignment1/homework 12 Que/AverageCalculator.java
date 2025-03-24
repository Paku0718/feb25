public class AverageCalculator {
    public static void main(String[] args) {
        // Declare three integer numbers
        int num1 = 10, num2 = 20, num3 = 30;

        // Calculate sum
        int sum = num1 + num2 + num3;

        // Calculate average with typecasting to double
        double average = (double) sum / 3;

        // Display results
        System.out.println("Numbers: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Sum: " + sum);
        System.out.println("Average (double): " + average);
    }
}