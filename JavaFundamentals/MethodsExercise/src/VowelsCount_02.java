import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        System.out.println(vowelsCounter(line));
    }

    private static int vowelsCounter(String line) {
        int vowelsCounter = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 65 || line.charAt(i) == 69 || line.charAt(i) == 73 || line.charAt(i) == 79 || line.charAt(i) == 85 ||
                    line.charAt(i) == 97 || line.charAt(i) == 101 || line.charAt(i) == 105 || line.charAt(i) == 111 || line.charAt(i) == 117) {
                vowelsCounter++;
            }
        }

        return vowelsCounter;
    }
}
