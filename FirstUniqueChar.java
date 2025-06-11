package Strings;

import java.util.HashMap;

public class FirstUniqueChar {

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();

        // Step 1: Count frequency of each character
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // If no unique character found
    }

    public static void main(String[] args) {
        String input = "leetcode";
        int index = firstUniqChar(input);
        System.out.println("First unique character index: " + index); // Output: 0
    }
}
