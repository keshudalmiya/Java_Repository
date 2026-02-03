public class increment {
    public static void main(String[] args) {
        int a = 7;
        // System.out.println(a++);
        // System.out.println(++a); 
        // System.out.println(++a + a++);
        int b = ++a + ++a;
        System.out.println(b);
        System.out.println(a);
    }
}
