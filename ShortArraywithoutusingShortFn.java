package Arrays;
import java.util.Arrays;

public class ShortArraywithoutusingShortFn {
    public static void sortColors(int[] nums) {
            int low = 0, mid = 0, high = nums.length - 1;

            while (mid <= high) {
                if (nums[mid] == 0) {
                    // Swap with low and move both forward
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                } else if (nums[mid] == 1)
                {
                    // Correct place for 1, just move mid
                    mid++;
                } else
                {
                    // Swap with high and move high backward
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                }
            }
        }

        public static void main(String[] args) {
            int[] nums = {2, 0, 2, 1, 1, 0};
            sortColors(nums);
            System.out.println("Sorted Array: " + Arrays.toString(nums));  // Output: [0, 0, 1, 1, 2, 2]
        }
    }


