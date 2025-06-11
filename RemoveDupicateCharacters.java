package Strings;

/*public class RemoveDupicateCharacters {
    public static void main(String[] args) {
        String str="java program";
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    System.out.print(""+str.charAt(i));
                }

            }

        }
    }

} */
//  output: aaar


public class RemoveDupicateCharacters  {
    public static void main(String[] args) {
        String str = "java program";

        for (int i = 0; i < str.length(); i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate && str.charAt(i) != ' ') {
                System.out.print(" "+str.charAt(i));
            }
        }
    }
}
// output  j v p o g m