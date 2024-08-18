import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String elements = scanner.nextLine();

        String[] arrayOfElements = elements.split(" ");

        String[] array = new String[arrayOfElements.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = arrayOfElements[i];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }


    }
}
