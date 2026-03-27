abstract class Calculator {
    static void show(){
        System.out.println("something");
    }

    abstract static void display(){
        System.out.println("something");
    }
    Calculator() {
        System.out.println("Calculator constructor called");
    }

    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
}

class SimpleCalculator extends Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}

public class abstract_constructor {
    public static void main(String[] args) {

        SimpleCalculator calc = new SimpleCalculator();
        calc.show();
        calc.display();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
    }
}
