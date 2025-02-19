import java.util.Scanner;

public class Ass20 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("input number : ");
		int number = scanner.nextInt();
		
		int count  = 0;
		int originalNumber = number;
		
		do {
			count++;
			number /= 10;
		} while(number !=0);
		System.out.println("The number " + originalNumber + " has " + count + " digits");

	}
}