public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Initial values: a = " + a + ", b = " + b);
        a = b;
        System.out.println("After a = b, a = " + a);
    
        a += b;
        System.out.println("After a += b, a = " + a);

        a -= b;
        System.out.println("After a -= b, a = " + a);
       
        a *= b;
        System.out.println("After a *= b, a = " + a);
     
        a /= b;
        System.out.println("After a /= b, a = " + a);
       
        a %= b; 
        System.out.println("After a %= b, a = " + a);
    }
}