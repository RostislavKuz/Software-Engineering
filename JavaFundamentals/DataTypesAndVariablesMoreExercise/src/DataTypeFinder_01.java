import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            boolean isInteger = false;  //------
            boolean isFloat = false;    //------
            boolean isChar = false;     //------
            boolean isBool = false;     //------
            boolean isString = false;

            boolean hasLetter = false;
            boolean hasNumber = false;
            boolean hasMinusInFront = false;
            boolean hasPoint = false;
            boolean hasSigh = false;

            int pointsCount = 0;
            int minusesCount = 0;

            if (input.length() == 1) {
                if (input.charAt(0) >= 48 && input.charAt(0) <= 57) {
                    System.out.printf("%s is integer type%n", input);
                } else {
                    System.out.printf("%s is character type%n", input);
                }
            } else {
                for (int i = 0; i < input.length(); i++) {
                    if ((input.charAt(i) >= 65 && input.charAt(i) <= 90) || (input.charAt(i) >= 97 && input.charAt(i) <= 122)) {
                        hasLetter = true;
                    }
                    if (input.charAt(i) == 46) {
                        pointsCount++;
                    }
                    if (input.charAt(0) == 45) {
                        hasMinusInFront = true;
                    }
                    if (input.charAt(i) == 45) {
                        minusesCount++;
                    }
                    if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                        hasNumber = true;
                    }
                    if (((input.charAt(i) >= 32 && input.charAt(i) <= 47) || (input.charAt(i) >= 58 && input.charAt(i) <= 64) || (input.charAt(i) >= 123 && input.charAt(i) <= 126)) && !hasMinusInFront) {
                        hasSigh = true;
                    }
                }
                if (pointsCount == 1) {
                    hasPoint = true;
                }
                if (minusesCount > 1) {
                    hasMinusInFront = false;
                    isString = true;
                }

                if (minusesCount == 1 && input.charAt(0) != 45) {
                    isString = true;
                }

                if (hasNumber && !hasLetter && !isString && !hasSigh && !hasPoint) {
                    System.out.printf("%s is integer type%n", input);
                } else if (hasPoint && !hasLetter && hasNumber && !isString) {
                    System.out.printf("%s is floating point type%n", input);
                } else if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                    System.out.printf("%s is boolean type%n", input);
                } else {
                    System.out.printf("%s is string type%n", input);
                }
            }

            input = scanner.nextLine();
        }


    }
}
