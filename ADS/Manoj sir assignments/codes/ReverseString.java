import java.util.*;

public class ReverseString {
    public static String reverseString(String str) {
        if (str.isEmpty()) return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine();
        System.out.println("Reversed string is: " + reverseString(s));
    }
}
