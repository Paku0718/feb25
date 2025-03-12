import java.util.Scanner;

public class Q23{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		String result[] = {"even","odd"};
		System.out.println(num + " is " + result[num & 1]);
		
	}
}