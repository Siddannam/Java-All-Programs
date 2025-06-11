package Arrays;

/*public class LargestArray {
    public static void main(String[] args) {
        int[] arr =new int[]{ 25,11,7,75,56};
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]<min)
              min=arr[i];
        }
        System.out.println("largest arry: "+min);
    }
}
*/


public class LargestArray
{
    public static void main(String[] args) {
        int[] arr = {25, 7, 11, 56, 8,};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }


            if (arr[i] < smallest) {
                smallest = arr[i];
            }

        }
        System.out.println("largest no:" + largest);
        System.out.println("smallaset no:" + smallest);
    }
}