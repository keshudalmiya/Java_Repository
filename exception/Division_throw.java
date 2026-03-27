public class Division_throw {

    static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
           
    }

    public static void main(String[] args) {

        try {
            int ans = divide(10, 0); 
            System.out.println("Result = " + ans);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
