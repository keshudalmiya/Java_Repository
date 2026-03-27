// Parent interface
interface A {
    default void show() {
        System.out.println("Show method from Interface A");
    }
}

// Child interface B
interface B extends A {
    default void show() {
        System.out.println("Show method from Interface B");
    }
}

// Child interface C
interface C extends A {
    default void show() {
        System.out.println("Show method from Interface C");
    }
}

// Class D implementing both interfaces
class D implements B, C {

    // Must override to resolve ambiguity
    public void show() {
        System.out.println("Diamond problem resolved in Class D");
         C.super.show();
    }
}

// Main class
public class DiamondDefault {
    public static void main(String[] args) {

        D obj = new D();
        obj.show();
      
    }
}
