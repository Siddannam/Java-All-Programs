package patternprograms;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        // upper part
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            for (int k = 1; k <= (2*i-1); k++)
                System.out.print("*");
            System.out.println();
        }
        // lower part
        for (int i = n-1; i >= 1; i--) {
            for (int j = n; j > i; j--)
                System.out.print(" ");
            for (int k = 1; k <= (2*i-1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}

