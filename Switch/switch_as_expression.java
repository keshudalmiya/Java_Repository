import java.util.Scanner;

public class switch_as_expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        String day = sc.nextLine().toLowerCase();

        String message = switch(day) {
            case "monday" -> "Start of week";
            case "friday" -> "Weekend coming";
            case "sunday" -> "Holiday";
            default -> "Normal day";
        };

        System.out.println(message);
        sc.close();
    }
}
