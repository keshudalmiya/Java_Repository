class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

class user_defined_exception {

    // division method
    static int divide(int a, int b) throws DivideByZeroException {

        if (b == 0) {
            // creating and throwing object
            throw new DivideByZeroException("Cannot divide by zero");
        }

        return a / b;
    }

    public static void main(String[] args) {

        try {
            int result = divide(10, 0);
            System.out.println("Result = " + result);
        }
        catch (DivideByZeroException e) {
            System.out.println("Exception handled:");
            System.out.println(e.getMessage());
        }
    }
}
