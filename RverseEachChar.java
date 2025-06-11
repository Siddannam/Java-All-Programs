package Strings;

public class RverseEachChar {
    public static void main(String[] args) {
        String str="  check yhe number is reverse ot not";
        String s[]= str.split(" ");
        for (int i = 0; i < s.length; i++) {

            String res=" ";
            String temp=s[i];
            for (int j=temp.length()-1; j >=0 ; j--) {
                res=res+temp.charAt(j);

            }
            System.out.print(res);
        }
    }
}
//out put:  kcehc ehy rebmun si esrever to ton