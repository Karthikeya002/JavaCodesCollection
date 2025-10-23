public class ExceptionHandling {
    public static void main(String[] args) {
        // Try-catch example
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }

        // Division by zero example
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
