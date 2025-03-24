import java.util.Scanner;
public class Solution1 {
    static boolean isAnagram(String a, String b) {
        // If lengths are different, they can't be anagrams
        if (a.length() != b.length()) {
            return false;
        }
        
        // Convert strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // Create an array to store character frequencies (for the 26 lowercase English letters)
        int[] charFrequencies = new int[26];
        
        // Count frequencies of characters in string a
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            charFrequencies[c - 'a']++;
        }
        
        // Decrement frequencies based on string b
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            charFrequencies[c - 'a']--;
        }
        
        // Check if all frequencies are zero
        for (int frequency : charFrequencies) {
            if (frequency != 0) {
                return false;
            }
        }
        
        // If we get here, the strings are anagrams
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}