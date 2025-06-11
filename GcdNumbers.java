package Basic;

public class GcdNumbers {
    public static void main(String[] args) {
        int x = 12,  y = 10,gcd = 1;
        for (int i = 1; i<= x && i<= y; i++) {
            if(x%i == 0 && y%i == 0){
                gcd = i;
            }
            System.out.print(" "+gcd);
        }
        System.out.println("\n");
         int lcm=(x*y)/gcd;
        System.out.print("lcm numbers: "+lcm);
    }
}
