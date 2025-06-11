package Arrays;

public class SumOfEachDigitsinAray {
    public static void main(String[] args) {
        int[] arr={123,45,9,100,78};
        System.out.println("Sum of each digits in array element:");
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int sum=0;
            while(num>0){
                sum+=num%10;
                num=num/10;

            }
            System.out.println("numbers:"+ arr[i] + " sum of digits: " + sum + " ");
        }
    }
}
