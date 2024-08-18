import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String word = "";
        String text = "";

        boolean isC = false;
        boolean isO = false;
        boolean isN = false;

        while (!command.equals("End")) {

            char letter = command.charAt(0);

            if (Character.isAlphabetic(letter)) {

                if (isC && isO && isN) {
                    text += word;
                    text += " ";
                    word = "";
                    word += letter;

                    isC = false;
                    isO = false;
                    isN = false;


                } else {
                    if (letter == 'c') {
                        if (!isC) {
                            isC = true;
                        } else {
                            word += letter;
                        }
                    } else if (letter == 'o') {
                        if (!isO) {
                            isO = true;
                        } else {
                            word += letter;
                        }
                    } else if (letter == 'n') {
                        if (!isN) {
                            isN = true;
                        } else {
                            word += letter;
                        }
                    } else {
                        word += letter;
                    }
                }

            }
            command = scanner.nextLine();

            if (command.equals("End") && (isC && isN && isO)) {
                text = text + word + " ";
            }
        }

        System.out.println(text);

    }
}