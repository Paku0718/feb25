import java.util.Scanner;

public class Ass9 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input radius : ");
		double radius = scanner.nextInt();
		
		double Area = 3.14 * radius * radius;

		System.out.println("Area of circle : " + Area);
			

	}
}