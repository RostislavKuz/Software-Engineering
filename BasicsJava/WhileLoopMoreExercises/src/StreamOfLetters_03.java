import java.util.Scanner;

public class StreamOfLetters_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String word = "";
        String text = "";

        boolean isC = false;
        boolean isO = false;
        boolean isN = false;


        while (!command.equals("End")) {

            if ((command.charAt(0) >= 'a' && command.charAt(0) <= 'z') || (command.charAt(0) >= 'A' && command.charAt(0) <= 'Z')) {
                if (!isC || !isO || !isN) {

                    if (command.equals("c")) {
                        if (!isC) {
                            isC = true;
                        } else {
                            word += command;
                        }
                    } else if (command.equals("o")) {
                        if (!isO) {
                            isO = true;
                        } else {
                            word += command;
                        }
                    } else if (command.equals("n")) {
                        if (!isN) {
                            isN = true;
                        } else {
                            word += command;
                        }
                    } else {
                        word += command;
                    }


                } else {
                    text += word;
                    text += " ";
                    word = "";
                    word += command;

                    isC = false;
                    isO = false;
                    isN = false;
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
