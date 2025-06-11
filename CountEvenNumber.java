package Arrays;

public class CountEvenNumber {

    // Method to find how many numbers have even number of digits
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            String s = Integer.toString(i);
            if (s.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        CountEvenNumber solution = new CountEvenNumber();

        // Sample test array
        int[] nums = {12, 345, 2, 6, 7896};

        // Call the method and print result
        int result = solution.findNumbers(nums);
        System.out.println("Count of numbers with even number of digits: " + result);
    }
}

