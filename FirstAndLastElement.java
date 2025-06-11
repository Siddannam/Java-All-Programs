package Arrays;

import java.util.ArrayList;

public class FirstAndLastElement {
    public static void main(String[] args) {
        int[] array={4,3,2,5,6};
        ArrayList<Integer> list= new ArrayList<Integer>();
       for(int num:array)
           list.add(num);
        int first=list.get(0);
        int last=list.get(list.size()-1);

System.out.println(first);
System.out.println(last);
    }

}
