import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();
        ArrayDeque<String> textStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();

            int commandNumber = Integer.parseInt(command.split("\\s+")[0]);
            switch (commandNumber) {

                case 1:
                    String stringToAppend = command.split("\\s+")[1];
                    textStack.push(currentText.toString());
                    currentText.append(stringToAppend);
                    break;
                case 2:
                    textStack.push(currentText.toString());
                    int countElementsForDelete = Integer.parseInt(command.split("\\s+")[1]);
                    int startIndex = currentText.length() - countElementsForDelete;
                    currentText.delete(startIndex, currentText.length());
                    break;
                case 3:
                    int indexOfElementToReturn = Integer.parseInt(command.split("\\s+")[1]);
                    System.out.println(currentText.charAt(indexOfElementToReturn - 1));
                    break;
                case 4:
                    if (!textStack.isEmpty()) {
                        currentText = new StringBuilder(textStack.pop());
                    }
                    break;
            }
        }


    }
}
