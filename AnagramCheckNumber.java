package Strings;

import java.util.HashMap;
import java.util.Map;

class AnagramCheckNummber {

    public static boolean areAnagrams(String str, int[] n) {
        if (n.length != 10) return false;

        // Step 1: Build frequency map from the string
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false; // Skip non-digit characters
            int digit = c - '0';
            freqMap.put(digit, freqMap.getOrDefault(digit, 0) + 1);
        }

        // Step 2: Compare map frequencies with array
        for (int i = 0; i < 10; i++) {
            int countInMap = freqMap.getOrDefault(i, 0);
            if (countInMap != n[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "123321";
        int[] n = {0, 2, 2, 2, 0, 0, 0, 0, 0, 0};

        boolean result = areAnagrams(str, n);
        System.out.println("Are the string and the frequency array anagrams? " + result);
    }
}
