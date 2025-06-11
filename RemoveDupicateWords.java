package Arrays;

/*public class RemoveDupicateWords
{
    public static void main(String[] args)
    {
        String arr[] = {"apple", "banna", "apple", "grapes", "banna"};
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++) {


                if (arr[i].equals(arr[j]))
                {

                    System.out.print(" " + arr[i]);

                }

            }
        }
    }
}
/*output
apple banna
Process finished with exit code */



import java.util.LinkedHashSet;

public class RemoveDupicateWords {
    public static void main(String[] args) {
        String arr[] = {"apple", "banna", "apple", "grapes", "banna"};

        // Using LinkedHashSet to preserve order and remove duplicates
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();

        for (String word : arr) {
            uniqueWords.add(word);
        }

        // Print the remaining words (duplicates removed)
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
    }
}
/*output
apple banna grapes */