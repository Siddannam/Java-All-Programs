package Basic;

public class RemoveSpace {
    public static void main(String[] args) {
         String Str="hello java hood";

          String res = Str.replaceAll("\\s", "");
          System.out.println("result: " +res);
    }
}
