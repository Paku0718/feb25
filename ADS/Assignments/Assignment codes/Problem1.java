public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 20, 0, 8, 15};

        // Find second largest
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        // Move zeros to end
        int[] result = new int[arr.length];
        int index = 0;
        for (int num : arr) {
            if (num != 0) result[index++] = num;
        }

        System.out.println("Second largest element: " + second);
        System.out.print("Array after moving zeros: ");
        for (int num : result) System.out.print(num + " ");
    }
}
