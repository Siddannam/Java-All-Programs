package Arrays;

import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        // Sample input list
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Map to store result
        Map<Integer, Integer> result = new LinkedHashMap<>();

        // Initialize the map for 1 to 9
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        // Count multiples
        for (int num : input) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        // Print the result
        System.out.println(result);
    }
}
/*
 input: [1,2,8,9,12,46,76,82,15,20,30]
  Output:
    {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
 */