package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int total;
        int [] numbers =new int[]{1,2,3,4,6,7};
        total=7;
        int tsum=total*((total+1)/2);
        int num_sum=0;
        for(int i:numbers)
        {
            num_sum+=i;
        }
       System.out.println(tsum-num_sum);
    }
}
