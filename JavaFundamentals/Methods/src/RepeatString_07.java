import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        String repeated = repeatString(line, repeatCount);
        System.out.println(repeated);
    }

    private static String repeatString(String line, int repeatCount) {

        String[] result = new String[repeatCount];

        for (int i = 0; i < result.length; i++) {
            result[i] = line;
        }

        return String.join("", result);
    }
}
