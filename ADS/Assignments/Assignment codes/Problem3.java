public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 6, 8};
        int key = 3;

        // Binary Search
        int idx = binarySearch(arr, key);
        System.out.println("Key found at index: " + idx);

        // First & Last Occurrence
        int first = firstOccurrence(arr, key);
        int last = lastOccurrence(arr, key);
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
        System.out.println("Total count of key: " + (last - first + 1));

        // Peak Element
        int[] peakArr = {1, 2, 18, 4, 5, 0};
        int peak = findPeak(peakArr);
        System.out.println("Peak element: " + peak);
    }

    static int binarySearch(int[] arr, int key) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    static int firstOccurrence(int[] arr, int key) {
        int l = 0, r = arr.length - 1, res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) {
                res = mid;
                r = mid - 1;
            } else if (arr[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        return res;
    }

    static int lastOccurrence(int[] arr, int key) {
        int l = 0, r = arr.length - 1, res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) {
                res = mid;
                l = mid + 1;
            } else if (arr[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        return res;
    }

    static int findPeak(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if ((i == 0 || arr[i] > arr[i - 1]) &&
                (i == n - 1 || arr[i] > arr[i + 1])) {
                return arr[i];
            }
        }
        return -1;
    }
}
