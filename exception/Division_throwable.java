public class Division_throwable {

    static int divide(int a, int b) throws Throwable {
        int result = a / b; 
        return result;
    }

    public static void main(String[] args) {

        try {
            int ans = divide(10, 0);
            System.out.println("Result = " + ans);
        }
        catch (Throwable t) {
            System.out.println("Exception handled using Throwable");
            System.out.println(t);
        }
    }
}
