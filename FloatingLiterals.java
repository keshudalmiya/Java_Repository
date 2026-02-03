public class FloatingLiterals {
    public static void main(String[] args) {
       
        float f1 = 101.230f;           
        double d1 = 0123.222f;          
        double d2 = 0x1.8p3;         
        float f2 = 4.56e-2f;        

        System.out.println("Float literal f1: " + f1);
        System.out.println("Double literal d1: " + d1);
        System.out.println("Double literal d2 (scientific): " + d2);
        System.out.println("Float literal f2 (scientific): " + f2);
    
    }
}
