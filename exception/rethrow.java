class rethrow {

    static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught in divide()");
            throw e;   
        }
    }

    public static void main(String[] args) {

        try {
            divide(10, 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled in main()");
        }
    }
}
