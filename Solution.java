package Arrays;

public class Solution {

    // Method to check if s2 can be formed from s1 with character increment allowed
    public boolean canMakeSubsequence(String s1, String s2) {
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(j);
            // Match directly or allow one alphabetical step (with wraparound from z to a)
            if (c1 == c2 || (c1 + 1 == c2) || (c1 == 'z' && c2 == 'a')) {
                j++;
            }
            i++;
        }
        return j == s2.length();
    }

    // Main method to test the logic
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        String s1 = "abcde";
        String s2 = "bd";

        boolean result = solution.canMakeSubsequence(s1, s2);
        System.out.println("Can make subsequence: " + result);

        // Another test with wraparound
        String s3 = "xyz";
        String s4 = "ya";
        System.out.println("Can make subsequence (wraparound): " + solution.canMakeSubsequence(s3, s4));
    }
}

/*Example 1:

Input: str1 = "abc", str2 = "ad"
Output: true
Explanation: Select index 2 in str1.
Increment str1[2] to become 'd'.
Hence, str1 becomes "abd" and str2 is now a subsequence. Therefore, true is returned.*/