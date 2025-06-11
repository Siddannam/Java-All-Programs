package Basic;

import java.util.Scanner;
public class OddSeriesBasedOnInput {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number (a): ");
            int a = scanner.nextInt();

            int count = (a % 2 == 0) ? a - 1 : a;
            int num = 1;

            for (int i = 0; i < count; i++) {
                System.out.print(num);
                if (i != count - 1) {
                    System.out.print(", ");
                }
                num += 2;
            }

            scanner.close();
        }
    }

/*
Output:
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5
    5) input a = 5, then output : 1, 3, 5, 7, 9
    6) input a = 6, then output : 1, 3, 5, 7, 9
 */