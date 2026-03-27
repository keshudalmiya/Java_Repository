abstract class Animal {

    abstract void sound(); // abstract method

    void sleep() { // normal method
        System.out.println("Animal sleeps");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class abstarct_class {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}

