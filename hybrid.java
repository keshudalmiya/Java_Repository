class A {
    void show() {
        System.out.println("Show IN Class A");
    }
}

interface B {
    void Show();
}

interface C {
    void Show();
}

class D extends A implements B, C {

    // overriding method from class A
    void show() {
        System.out.println("Show In class D");
    }

    // implementing interface method
    public void Show() {
        System.out.println("Show method from Interface B and C");
        super.show();
    }
}

public class hybrid {
    public static void main(String[] args) {

        D s = new D();

        s.show();   // class method
        s.Show();   // interface method

    }
}
