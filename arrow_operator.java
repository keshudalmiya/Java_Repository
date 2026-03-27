import java.util.Scanner;

public class arrow_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter day: ");
        String day = sc.nextLine().toLowerCase();
        
        switch(day) {
            case "monday" -> System.out.println("Start of week");
            case "friday" -> System.out.println("Weekend coming");
            case "sunday" -> System.out.println("Holiday");
            default -> System.out.println("Normal day");
        }
        
        sc.close();
    }
}
