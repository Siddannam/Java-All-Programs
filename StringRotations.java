package Strings;

public class StringRotations {
    static  boolean areRotations(String str1,String str2)
    {
        return (str1.length()==str2.length()) && ((str1+str1).indexOf(str2)!=-1);
    }


    public static void main(String[] args) {
        String str1="AACD";
        String str2="ACDA";
        if(areRotations(str1,str2))
            System.out.println("String are rotations");


    }
}
