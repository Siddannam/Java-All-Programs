package OOPS;

public class Encapsulation
{
    private int pwd = 123;
    public int getpwd()
    {
        return pwd;
    }
    public void setPwd(int pwd)
    {
        this.pwd = pwd;
    }

    public static void main(String[] args)
    {
        Encapsulation en=new Encapsulation();
        System.out.println(en.getpwd());
        en.setPwd(143);
        System.out.println(en.getpwd());
    }
}
