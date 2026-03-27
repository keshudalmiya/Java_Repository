// Parent class
class Parent {

    // Parent class constructor
    Parent() {
        System.out.println("Parent class constructor called");
    }
}

// Child class
class Child extends Parent {

    // Child class constructor
    Child() {
        System.out.println("Child class constructor called");
    }
}

// Main class (default class with main method)
public class Main {

    public static void main(String[] args) {

        // Creating object of Child class
        Child obj = new Child();

    }
}
