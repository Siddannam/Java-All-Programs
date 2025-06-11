package Arrays;

public class ArrayDescendingOrder {
    public static void main(String[] args) {
        int[] arr={ 5,3,6,7,1,9};
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("aray Decending order");
        for(int num :arr){
            System.out.print(num+" ");
        }
    }


}
