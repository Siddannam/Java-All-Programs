package Arrays;

import java.util.TreeSet;

/*public class RemoveDupicateNumbers {
    public static void main(String[] args) {
        int[] arr={10,20,10,40,30,10};
        TreeSet  s=new TreeSet();
        for (int i = 0; i < arr.length ; i++) {
            s.add(arr[i]);

        }
        System.out.println(s);
    }
}  */
// output [10, 20, 30, 40]




/* public class RemoveDupicateNumbers  {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10,20, 40, 30, 10};

        System.out.print("Duplicate numbers: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Check if this duplicate was already printed
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (isDuplicate && !alreadyPrinted) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
*/




/*import java.util.HashMap;
import java.util.Map;

public class  RemoveDupicateNumbers {
    public static void main(String[] args) {
        int[] arr = { 20, 20, 10, 40, 30, 10};

        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Print duplicates and their count
        System.out.println("Duplicates and their counts:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
            }
        }
    }
}           */
//Duplicates and their counts:
//20 → 2 times
//10 → 2 times




public class RemoveDupicateNumbers {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 40, 30, 10};
        int[] unique = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique[count++] = arr[i];
            }
        }

        System.out.println("Unique values count: " + count);

        // Optional: print the unique values
        System.out.print("Unique values: ");
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
