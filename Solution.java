package Strings;

public class Solution {

    public boolean canChange(String start, String target) {
        int n = start.length();

        char[] st = start.toCharArray();
        char[] tar = target.toCharArray();

        int i = 0, j = 0;

        while (i < n && j < n) {
            // Skip underscores in both strings
            while (i < n && st[i] == '_') i++;
            while (j < n && tar[j] == '_') j++;

            // If one reaches the end before the other
            if (i == n || j == n) {
                return i == n && j == n;
            }

            // Characters must match
            if (st[i] != tar[j]) {
                return false;
            }

            // Movement rules:
            // 'L' can only move left (i >= j), 'R' can only move right (i <= j)
            if (st[i] == 'L' && i < j) return false;
            if (st[i] == 'R' && i > j) return false;

            i++;
            j++;
        }

        // Skip remaining underscores
        while (i < n && st[i] == '_') i++;
        while (j < n && tar[j] == '_') j++;

        return i == n && j == n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String start = "_L__R__R_";
        String target = "L______RR";

        boolean result = solution.canChange(start, target);
        System.out.println("Can change: " + result);
    }
}
/* Example 1:

Input: start = "_L__R__R_", target = "L______RR"
Output: true
Explanation: We can obtain the string target from start by doing the following moves:
- Move the first piece one step to the left, start becomes equal to "L___R__R_".
- Move the last piece one step to the right, start becomes equal to "L___R___R".
- Move the second piece three steps to the right, start becomes equal to "L______RR".
Since it is possible to get the string target from start, we return true.
Example 2:

Input: start = "R_L_", target = "__LR"
Output: false
Explanation: The 'R' piece in the string start can move one step to the right to obtain "_RL_".
After that, no pieces can move anymore, so it is impossible to obtain the string target from start.*/
