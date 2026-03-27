// import java.util.Scanner;

// public class yield_switch {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a number (1-3): ");
//         int num = sc.nextInt();
        
//         // Switch expression using yield
//         String result = switch(num) {
            
//             case 1 -> "One";
            
//             case 2 -> {
//                 System.out.println("Processing number 2...");
//                 yield "Two";   // returning value
//             }
            
//             case 3 -> {
//                 System.out.println("Processing number 3...");
//                 yield "Three";
//             }
            
//             default -> {
//                 System.out.println("Invalid input");
//                 yield "Unknown";
//             }
//         };
        
//         System.out.println("Result: " + result);
        
//         sc.close();
//     }
// }

import java.util.Scanner;

public class yield_switch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number (1-3): ");
        int num = sc.nextInt();
        
        // Switch expression using colon (:) and yield
        String result = switch(num) {
            
            case 1:
                yield "One";
                
            case 2:
                System.out.println("Processing 2...");
                yield "Two";
                
            case 3:
                System.out.println("Processing 3...");
                yield "Three";
                
            default:
                yield "Invalid";
        };
        
        System.out.println("Result: " + result);
        
        sc.close();
    }
}
