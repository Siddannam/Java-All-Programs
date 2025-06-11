package OOPS;

interface Animal {
    void noice();
}

class Cat implements Animal {
    public void noice() {
        System.out.println("meow meow");
    }
}

class Dog implements Animal {
    public void noice() {
        System.out.println("bow bow");
    }
}

class Snake implements Animal {
    public void noice() {
        System.out.println("smeow smeow");
    }
}

class Stimulates {
    static void ansm(Animal a1) {
        a1.noice();
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        Snake s1 = new Snake();

        Stimulates.ansm(c1);
        Stimulates.ansm(d1);
        Stimulates.ansm(s1);
    }
}
