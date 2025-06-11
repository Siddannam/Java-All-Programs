package Arrays;
import java.util.Scanner;

    public class TwoDimensionalArray
    {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            // Taking Number of Rows and Columns from User
            System.out.print("Enter number of rows: ");
            int row = sc.nextInt();

            System.out.print("Enter number of columns: ");
            int col = sc.nextInt();

            int[][] arr= new int[row][col];

            System.out.println("Enter elements of array: ");

            // Taking input from user for each element of array
            // using nested for loop
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j]= sc.nextInt();
                }
            }


            System.out.println("Elements of array are: ");
            // Printing Elements of Arrays
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j]+ " ");
                }

                System.out.println();
            }
            sc.close();
        }
    }
