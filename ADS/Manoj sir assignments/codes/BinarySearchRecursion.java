public class BinarySearchRecursion {
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, left, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9};
        int target = 5;
        int result = binarySearch(sortedArray, target, 0, sortedArray.length - 1);
        System.out.println("Index of " + target + ": " + result);
    }
}