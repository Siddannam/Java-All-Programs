package Basic;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        // A power of two is greater than 0 and has only one set bit in binary
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int input = 16;
        boolean result = isPowerOfTwo(input);
        System.out.println("Is " + input + " a power of two? " + result);  // Output: true
    }
}

