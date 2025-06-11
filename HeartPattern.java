package patternprograms;

public class HeartPattern {
    public static void main(String[] args) {
        int n = 6;
        // upper part
        for (int i = n/2; i <= n; i+=2) {
            for (int j = 1; j < n-i; j+=2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower part
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

