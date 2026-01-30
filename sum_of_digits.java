public class sum_of_digits {
    public static void main(String[] args) {
        int number = 12345; // Example number
        int sum = calculateSumOfDigits(number);
        System.out.println("The sum of digits in " + number + " is: " + sum);
    }

    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10;       // Remove the last digit
        }
        return sum;
    }
}
