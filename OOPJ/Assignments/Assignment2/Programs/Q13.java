import java.util.Scanner;

public class Q13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		int mask = num >> 31;
       
        int absoluteValue = (num + mask) ^ mask;
        
        System.out.println("Absolute value of " + num + " is " + absoluteValue);
	}
}