package patternprograms.Aphabeates;

public class StarXPattern {
    public static void main(String[] args) {
        int n = 5; // must be odd

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || (i + j) == (n + 1)) {
                    System.out.print("5");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

