import java.util.Scanner;

public class Ass7 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input number :");
		int number = scanner.nextInt();
		
		
		for(int i = 1; i<=10; i++){
			int mul= number * i;
			System.out.println(number + " x " + i + " = " +mul);
		}		

	}
}