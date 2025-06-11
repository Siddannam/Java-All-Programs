package patternprograms.Aphabeates;

public class WPattern {
    public static void main(String[] args) {
        int n = 7; // must be odd number

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0 || j == n || (i >= n/2 && (i == j || i + j == n))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

