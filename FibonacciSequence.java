public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("This program lists the Fibonacci sequence.");
        final int MAX_TERM_VALUE = 7000;
        int num1 = 0;
        int num2 = 1;
        int sum = 1;
        System.out.print(0);
        while (sum <= MAX_TERM_VALUE) {
            System.out.print(", " + sum);
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
