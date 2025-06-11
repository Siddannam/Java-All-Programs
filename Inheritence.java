package OOPS;
// Parent class (superclass)
class Animal2 {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Child class (subclass) inherits from Animal
class Dog2 extends Animal2 {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Another child class
class Cat2 extends Animal2 {
    void meow() {
        System.out.println("The cat meows.");
    }
}

// Main class
 class inheritence {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.eat();     // Inherited from Animal
        dog.sleep();   // Inherited from Animal
        dog.bark();    // Specific to Dog

        System.out.println();

        Cat2 cat = new Cat2();
        cat.eat();     // Inherited from Animal
        cat.sleep();   // Inherited from Animal
        cat.meow();    // Specific to Cat
    }
}
