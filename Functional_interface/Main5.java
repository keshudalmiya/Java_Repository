interface MyInterface {

    // Abstract method
    void show();

    // Default method
    default void display() {
        System.out.println("This is default method");
    }

    // Static method
    static void print() {
        System.out.println("This is static method");
    }
}

// 🔹 Child class implementing interface
class Child implements MyInterface {
    public void show() {
        System.out.println("This is abstract method from Child class");
    }
}

public class Main5 {
    public static void main(String[] args) {

        // ✔ Using lambda
        MyInterface obj1 = () -> System.out.println("This is abstract method using lambda");

        obj1.show();
        obj1.display();
        MyInterface.print();

        System.out.println("-----");

        // ✔ Using child class
        MyInterface obj2 = new Child();

        obj2.show();
        obj2.display();
        MyInterface.print();
    }
}

