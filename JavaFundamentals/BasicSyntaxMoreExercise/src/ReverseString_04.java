import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");

        for (int i = 0; i < input.length / 2; i++) {
            String reserve = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = reserve;

        }

        String result = String.join("", input);

        System.out.println(result);


    }
}
