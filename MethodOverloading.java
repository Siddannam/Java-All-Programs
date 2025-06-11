package OOPS;


class whataap2{
    static  void  send( int no){
        System.out.println("sending no: "+no);
    }

    static  void send(String textmsg){
        System.out.println("sending text: "+textmsg);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        whataap2 .send(12);
        whataap2.send("hi");


    }
}
