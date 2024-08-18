import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        checkPassword(password);
    }

    private static void checkPassword(String password) {

        boolean charactersBetween6And10 = checkNumberOfCharacters(password);
        boolean onlyLettersAndDigits = checkLettersAndDigits(password);
        boolean hasMinSize = checkPasswordSize(password);

        if (charactersBetween6And10 && onlyLettersAndDigits && hasMinSize) {
            System.out.println("Password is valid");
        }

        if (!charactersBetween6And10) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!onlyLettersAndDigits) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!hasMinSize) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    private static boolean checkPasswordSize(String password) {
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                numberOfDigits++;
            }
        }
        if (numberOfDigits >= 2) {
            return true;
        }
        return false;
    }

    private static boolean checkLettersAndDigits(String password) {


        for (int i = 0; i < password.length(); i++) {
            if ((password.charAt(i) >= 48 && password.charAt(i) <= 57) || (password.charAt(i) >= 65 && password.charAt(i) <= 90)
                    || (password.charAt(i) >= 97 && password.charAt(i) <= 122)) {
            } else {
                return false;
            }
        }
        return true;

    }

    private static boolean checkNumberOfCharacters(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        return false;
    }

}
