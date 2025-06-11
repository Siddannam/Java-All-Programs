package Basic;

import java.util.Scanner;
public class OddSeriesGenerator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number (a): ");
            int a = scanner.nextInt();
            int num = 1;
            for (int i = 0; i < a; i++) {
                System.out.print(num);
                if (i != a - 1) {
                    System.out.print(", ");
                }
                num += 2;
            }

            scanner.close();
        }
    }
/*output

Output:
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1, 3
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5, 7
 */

