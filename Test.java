class Test {
    public static void main(String args[]) {

        try {
            int a = 10 / 0;   // error
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
