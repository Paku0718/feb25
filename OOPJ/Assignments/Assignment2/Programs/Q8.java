import java.util.Scanner;

public class Q8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 booleans");
		boolean num1 = nextBoolean();
		boolean num2 = nextBoolean();
		boolean num3 = nextBoolean();
		
		boolean isTrue = (num1 && num2) || (num2 && num3) || (num1 && num3);
		
		System.out.println("At least two are true:" + isTrue);
		
	}
}