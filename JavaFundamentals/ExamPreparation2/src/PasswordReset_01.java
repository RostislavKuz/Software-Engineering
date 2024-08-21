import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "TakeOdd":
                    StringBuilder password = new StringBuilder();
                    for (int i = 0; i < line.length(); i++) {
                        if (i % 2 != 0) {
                            password.append(line.charAt(i));
                        }
                    }
                    line = password.toString();
                    System.out.println(line);
                    break;
                case "Cut":
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    String substringToRemove = line.substring(index, index + length);

                    line = line.replaceFirst(substringToRemove, "");
                    System.out.println(line);
                    break;
                case "Substitute":
                    String substitute = tokens[2];

                    if (line.contains(tokens[1])){
                        line = line.replace(tokens[1], substitute);
                        System.out.println(line);
                    }else {
                        System.out.println("Nothing to replace!");
                    }

                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println("Your password is: " + line);


    }
}
