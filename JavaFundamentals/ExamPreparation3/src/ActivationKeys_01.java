import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String rawActivationKey = scanner.nextLine();
        StringBuilder rawActivationKey = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] tokens = input.split(">>>");
            String command = tokens[0];

            switch (command) {
                case "Contains":
                    String substring = tokens[1];
                    if (rawActivationKey.indexOf(substring) >= 0) {
                        System.out.printf("%s contains %s%n",
                                rawActivationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    String str = rawActivationKey.substring(startIndex, endIndex);

                    if (upperOrLower.equals("Upper")) {
                        str = str.toUpperCase();
                    } else {
                        str = str.toLowerCase();
                    }
                    rawActivationKey.replace(startIndex, endIndex, str);
                    System.out.println(rawActivationKey);
                    break;
                case "Slice":
                    int startInd = Integer.parseInt(tokens[1]);
                    int endInd = Integer.parseInt(tokens[2]);
                    rawActivationKey.replace(startInd, endInd, "");
                    System.out.println(rawActivationKey);
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s", rawActivationKey);


    }
}
