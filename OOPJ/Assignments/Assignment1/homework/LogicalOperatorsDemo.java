public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        int num = 10; 
   
        if (num > 0 && num % 2 == 0) {
            System.out.println(num + " is positive and even.");
        } else {
            System.out.println(num + " does not meet the conditions.");
        }
        
        if (num < 0 || num % 2 != 0) {
            System.out.println(num + " is either negative or odd.");
        } else {
            System.out.println(num + " is neither negative nor odd.");
        }

        boolean isPositive = num > 0;
        System.out.println("The number is positive: " + isPositive);
        System.out.println("Negation: " + !isPositive);
    }
}
