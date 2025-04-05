public class Problem2 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        String sentence = "Practice makes a man perfect";

        boolean isAnagram = areAnagrams(s1, s2);
        System.out.println("Are '" + s1 + "' and '" + s2 + "' anagrams? " + isAnagram);

        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        System.out.println("Longest word: " + longest);
      
        int vowels = 0, consonants = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] freq = new int[26];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }
        for (int f : freq) if (f != 0) return false;
        return true;
    }
}
