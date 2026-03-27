import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter a day: ");
        String day = sc.nextLine();
        
        // Convert to lowercase (optional but good practice)
        day = day.toLowerCase();
        
        // Switch statement
        switch(day) {
            case "monday","tuesday":
                System.out.println("Start of week");
               
                
            case "friday","saturday":
                System.out.println("Weekend is coming");
                break;
                
            case "sunday":
                System.out.println("Holiday");
                break;
                
            default:
                System.out.println("Normal day");
        }
        
        sc.close();
    }
}
