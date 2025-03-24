import java.util.Scanner;

	public class Q17{
		
	
	public int min(int a, int b, int c, int d ){
		int minAB = (a<b) ? a : b;
		int minCD = (c<d) ? c : d;
		return (minAB<minCD) ? minAB : minCD;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();
		System.out.println("Enter forth number: ");
		int num4 = sc.nextInt();
	
		Q17 obj = new Q17();
		int minVal = obj.min(num1, num2, num3, num4);
	
		System.out.println("The minimum of four number is: " +  minVal);
	}
}