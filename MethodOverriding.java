package OOPS;
class whatsapp {

    void  Status()
    {
        System.out.println("hello");
    }

}
class whatsapp2 extends whatsapp
{
    void Status()
    {
        System.out.println("java");
        super.Status();
    }
}
class MethodOverriding {
    public static void main(String[] args) {

        whatsapp2 w = new whatsapp2();
        w.Status();
    }
}