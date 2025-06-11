package Strings;

public class AnagramCheck {

    public static boolean areAnagrams(String str1, String str2) {
        // If the lengths of the strings are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        // Create a character count array for the alphabet (assuming lowercase letters only)
        int[] charCount = new int[26]; // For 'a' to 'z'
        // Count frequency of characters in str1 and str2
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;  // Increment count for str1
            charCount[str2.charAt(i) - 'a']--;  // Decrement count for str2
        }

        // If the two strings are anagrams, all counts should be 0
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the strings anagrams? " + result);  // Output: true
    }
}
