public class NestedTryDemo {
    public static void main(String[] args) {

        try {
            System.out.println("Outer try block");

            // inner try
            try {
                int a = 10 / 0;
                System.out.println(a);

            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero");
            }

            int arr[] = new int[3];
            arr[5] = 10;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index error");
        }

        System.out.println("Program continues...");
    }
}
 