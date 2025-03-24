import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Check if a character is a vowel or consonant using ternary operator");
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0);
        
        String result = ((ch >= 'a' && ch <= 'z') ? 
                        // If it's a letter, check if it's a vowel
                        ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 
                            "a vowel" : "a consonant") 
                        // If it's not a letter
                        : "not a letter");
        
        System.out.println("'" + ch + "' is " + result);
        
    }
}