import java.util.Scanner;

public class ExtractPersonInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int firstIndexName = input.indexOf("@");
            int lastIndexName = input.indexOf("|");
            String name = input.substring(firstIndexName + 1, lastIndexName);

            int firstIndexAge = input.indexOf("#");
            int lastIndexAge = input.indexOf("*");
            String age = input.substring(firstIndexAge + 1, lastIndexAge);

            System.out.println(name + " is " + age + " years old.");
        }


    }
}
