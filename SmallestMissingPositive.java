package Arrays;

public class SmallestMissingPositive {

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its correct index if in range [1, n]
        for (int i = 0; i < n; i++) {
            while (
                    nums[i] > 0 && nums[i] <= n &&
                            nums[nums[i] - 1] != nums[i]
            ) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Step 2: Find the first index where the value is incorrect
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all values are correct from 1 to n
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int result = firstMissingPositive(nums);
        System.out.println("Smallest Missing Positive Integer: " + result);  // Output: 2
    }
}

