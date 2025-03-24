import java.util.Scanner;


public class Q16{
	
	public static String check(int n){
		return(n>0) ? "Positive" : (n<0) ? "Negative" : "Zero";
	
	}
		
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
	
	
		System.out.println("The Number " + num + " is " + check(num) );
		
	}
	
}