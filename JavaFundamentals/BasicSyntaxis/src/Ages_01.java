import java.util.Scanner;

public class Ages_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());

        String result = "";

        if (age >= 0 && age <= 2) {
            result = "baby";
        } else if (age >= 3 && age <= 13) {
            result = "child";
        } else if (age >= 14 && age <= 19) {
            result = "teenager";
        } else if (age >= 20 && age <= 65) {
            result = "adult";
        } else if (age >= 66) {
            result = "elder";
        }

        System.out.println(result);
    }
}
