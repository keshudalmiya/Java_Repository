public class Bitwise_operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int andResult = a & b;
        int orResult = a | b;  
        int xorResult = a ^ b; 
        int notResult = ~a;   
        int leftShiftResult = a << 1; 
        int rightShiftResult = a >> 1; 

        System.out.println("Bitwise AND (a & b): " + andResult);     
        System.out.println("Bitwise OR (a | b): " + orResult);          
        System.out.println("Bitwise XOR (a ^ b): " + xorResult);        
        System.out.println("Bitwise NOT (~a): " + notResult);           
        System.out.println("Left Shift (a << 1): " + leftShiftResult);  
        System.out.println("Right Shift (a >> 1): " + rightShiftResult);
    }
}
