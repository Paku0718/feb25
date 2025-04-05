import java.util.*;

public class PowerFunction {
    public static int power(int x, int n) {
        if (n == 0) return 1;
        return x * power(x, n - 1);
    }
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =  sc.nextInt();
		int b = sc.nextInt();
        System.out.println("2^5: " + power(a, b));
    }
}
