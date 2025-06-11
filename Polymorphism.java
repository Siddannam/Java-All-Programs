package OOPS;

class Animal1 {
    void noice() {
        System.out.println("Some generic animal sound");
    }
}

class Cat1 extends Animal1 {
    public void noice() {
        System.out.println("meow meow");
    }
}

class Dog1 extends Animal1 {
    public void noice() {
        System.out.println("bow bow");
    }
}

class Snake1 extends Animal1 {
    public void noice() {
        System.out.println("smeow smeow");
    }
}

class Stimulates1 {
    static void ansm(Animal a1) {
        a1.noice();
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal c1 = new Cat();
        Animal d1 = new Dog();
        Animal s1 = new Snake();

        Stimulates.ansm(c1);
        Stimulates.ansm(d1);
        Stimulates.ansm(s1);
    }
}
