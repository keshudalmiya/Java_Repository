class StaticMethod {
    static int add(int x,int y) {
        return(x + y);
    }
    static int mul(int x,int y) {
        return(x * y);
    }
    static int sub(int x,int y) {
        return(x - y);
    }
    static int div(int x,int y) {
        return(x / y);
    }
}
    public class calculator {
        public static void main(String[] args) {
            int a = 10, b = 5;
            System.out.println("Addition: " + StaticMethod.add(a, b));
            System.out.println("Multiplication: " + StaticMethod.mul(a, b));
            System.out.println("Subtraction: " + StaticMethod.sub(a, b));
            System.out.println("Division: " + StaticMethod.div(a, b));
        }
}
