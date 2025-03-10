import java.util.Scanner;

public class Q19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		
		String charType = (ch>= 'A' && ch<='Z') ? "uppercase letter" : (ch>='a' && ch<='z') ? "lowercase letter" : "not a letter";
		System.out.println(ch + " is " + charType);
	}
}
