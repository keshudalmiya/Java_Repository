import java.util.Scanner;

class area_of_circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int r = sc.nextInt();

        double area = 3.14 * r * r;

        System.out.println("Area = " + area);

        sc.close();
    }
}
