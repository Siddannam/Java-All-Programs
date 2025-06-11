package Arrays;

/*import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num); // store all numbers in a set
        }
        int longestStreak = 0;
        for (int num : numSet) {
            // Only start counting when it's the beginning of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        System.out.println("Longest Consecutive Sequence Length: " + result);  // Output: 4
    }
}

*/

import java.util.*;

public class LongestConsecutiveSequence {

    public static List<Integer> longestConsecutiveSequence(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        List<Integer> longestSequence = new ArrayList<>();
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                List<Integer> currentSequence = new ArrayList<>();
                currentSequence.add(currentNum);
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequence.add(currentNum);
                }
                if (currentSequence.size() > longestSequence.size()) {
                    longestSequence = currentSequence;
                }
            }
        }
        return longestSequence;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        List<Integer> sequence = longestConsecutiveSequence(nums);
        System.out.println("Sequence: " + sequence); // Output: [1, 2, 3, 4]
    }
}
