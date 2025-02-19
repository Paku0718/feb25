import java.util.Scanner;

public class Ass18 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input temperature in Celsius : ");
		double celsius = scanner.nextInt();
		
		double result = (celsius * 9/5) + 32;
		
		System.out.print(celsius + "°C is equal to " + result + "°F");
	
	}
}