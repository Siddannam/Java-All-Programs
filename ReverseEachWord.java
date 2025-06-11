package Strings;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str="java good in all language";

         String[] s= str.split(" ");
        for (int i = s.length-1; i >=0 ; i--) {
            String res=s[i];
            System.out.print(" "+res);

        }
        for (int i = 0; i < s.length; i++) {

            String res=" ";
            String temp=s[i];
            for (int j=temp.length()-1; j >=0 ; j--) {
                res=res+temp.charAt(j);

            }
            System.out.print("\n");
            System.out.println(" "+res);
        }
    }
}
