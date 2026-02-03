import java.util.Scanner;

class addition {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = s.nextInt();

        System.out.print("Enter second number: ");
        int b = s.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

        s.close();
    }
}
