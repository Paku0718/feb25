import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of subjects
        int s = scanner.nextInt();

        // Edge case: if no subjects, print 0 for both highest and average marks
        if (s == 0) {
            System.out.println(0);
            System.out.println("0.0");
            scanner.close();
            return;
        }

        int highest = Integer.MIN_VALUE;
        int sum = 0;

        // Reading marks and calculating highest mark and total sum
        for (int i = 0; i < s; i++) {
            int mark = scanner.nextInt();
            sum += mark;
            if (mark > highest) {
                highest = mark;
            }
        }

        // Calculating average mark
        double average = (double) sum / s;

        // Printing results
        System.out.println(highest);
        System.out.printf("%.1f\n", average);

        scanner.close();
    }
}
