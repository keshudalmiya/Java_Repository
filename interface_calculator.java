interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
}

class SimpleCalculator implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

public class interface_calculator {
    public static void main(String[] args) {

        Calculator calc = new SimpleCalculator();

        int sum = calc.add(10, 5);
        int diff = calc.subtract(10, 5);

        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + diff);
    }
}
