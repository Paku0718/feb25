public class PalindromeRecursion {
    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String input = "racecar";
        System.out.println("Is '" + input + "' a palindrome? " + isPalindrome(input, 0, input.length() - 1));
    }
}
