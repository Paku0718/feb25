import java.util.Scanner;
 
public class Ass10 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("input number : ");
		int number = scanner.nextInt();
		
		if(number%2==0){
			System.out.println("The number " + number + " is " + "Even");
		}else {
			System.out.println("The number " + number + " is " + "Odd");	
		}
		
	}
}