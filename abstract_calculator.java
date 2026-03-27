abstract class Calculator {

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


public class abstract_calculator {
    public static void main(String[] args) {

        SimpleCalculator calc = new SimpleCalculator();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
    }
}
