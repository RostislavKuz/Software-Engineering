public class Main {
    public static void main(String[] args) {

        int number = 100;
        while (number >= 0) {
            System.out.println(number);
            number--;
        }

        number = 100;
        printNumber(number);


        //System.out.println(fib(10));
    }

    private static void printNumber(int number) {
        if (number < 0) {
            return;
        }
        System.out.println(number);
        printNumber(number - 1);
    }


    /*public static long fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
     */

    //1:03
}
