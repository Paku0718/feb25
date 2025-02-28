import java.util.Scanner;

public class Ass17 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of N : ");
		
		int number = scanner.nextInt();
		
		for(int i =1; i<=number; i++){
			System.out.print(i + " ");
		}
		
		System.out.println();
		
	}
}