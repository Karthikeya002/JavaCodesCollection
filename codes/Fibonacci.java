public class Fibonacci {
    public static void fibonacciSequence(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10;
        fibonacciSequence(n);
    }
}
