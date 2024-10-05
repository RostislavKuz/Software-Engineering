import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);
        System.err.println("Hello System Error");

        int[] a = {1, 2, 3};
        System.out.println(a[1000]);
    }
}
