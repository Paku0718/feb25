package Recursion;
import java.util.*;

public class Print1 {
	static void printNo(int n) {
		if(n>0) {
			printNo(n-1);
			System.out.print(n + " ");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printNo(num);
		
	}
}
