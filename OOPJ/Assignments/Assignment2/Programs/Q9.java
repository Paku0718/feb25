import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Check if a number is within range 20-50 without if-else");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        boolean inRange = (number >= 20) && (number <= 50);
        
        System.out.println("Number " + number + " is " + (inRange ? "within" : "outside") + " the range 20-50");
        
    }
}