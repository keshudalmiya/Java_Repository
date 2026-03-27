@FunctionalInterface
interface Add {
    int sum(int a, int b); // abstract method
}

public class M {
    public static void main(String[] args) {

        // Lambda expression
        Add obj = (a, b) -> {
            return a + b;
        };

        int result = obj.sum(5, 3);

        System.out.println("Sum = " + result);
    }
}
