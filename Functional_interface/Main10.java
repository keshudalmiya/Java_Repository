interface Calculator {

    double square(int x);

    default int add(int a, int b) {
        return a + b;
    }

    default int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}

public class Main10 {
    public static void main(String[] args) {

        int a = 10, b = 5;

        Calculator calc = (x) -> x * x;

        System.out.println("Square: " + calc.square(a));

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.sub(a, b));

        System.out.println("Multiplication: " + Calculator.mul(a, b));
        System.out.println("Division: " + Calculator.div(a, b));
    }
}
