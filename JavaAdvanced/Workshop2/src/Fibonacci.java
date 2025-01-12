public class Fibonacci {

    static long[] memory = new long[101];

    public static void main(String[] args) {

        int n = 100;

        System.out.println(fib(n));
    }

    private static long fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        if (memory[n] != 0) {
            return memory[n];
        }

        return memory[n] = fib(n - 1) + fib(n - 2);
    }
}
