class ExceptionPropagationDivision {

    // Method where division happens
    static int divide(int a, int b) throws ArithmeticException {

        // checking condition using if-else
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        } 
        else {
            return a / b;
        }
    }

    // Method2 calling divide()
    static int method2(int x, int y) throws ArithmeticException {
        return divide(x, y);   // exception propagates
    }

    // Method1 calling method2()
    static int method1(int x, int y) throws ArithmeticException {
        return method2(x, y);  // exception propagates again
    }

    public static void main(String[] args) {

        try {
            int result = method1(10, 0);
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled in main()");
            System.out.println(e.getMessage());
        }
    }
}
