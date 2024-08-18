import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        int countBooks = Integer.parseInt(scanner.nextLine());
        int countCheckedBooks = 0;

        while (countBooks > countCheckedBooks) {
            String bookName = scanner.nextLine();

            if (bookName.equals(searchedBook)) {
                System.out.printf("You checked %d books and found it.", countCheckedBooks);
                break;
            }
            countCheckedBooks++;

        }

        if (countCheckedBooks >= countBooks) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countCheckedBooks);
        }
    }
}
