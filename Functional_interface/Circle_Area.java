import static java.lang.Math.PI;
import java.util.Scanner;

interface Circle {
    double area(double radius);
}

public class Circle_Area {
    public static void main(String[] args) {
        System.out.println("Enter radius");
        Scanner S = new Scanner(System.in);
        int r = S.nextInt();

        // change variable name here
        Circle c = (x) -> PI * x * x;

        double result = c.area(r);

        System.out.println("Area of Circle = " + result);
    }
}
