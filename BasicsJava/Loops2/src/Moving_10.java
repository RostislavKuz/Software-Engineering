import java.util.Scanner;

public class Moving_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int freeSpace = width * length * height;
        int needSpace = 0;

        while (!input.equals("Done")) {
            needSpace += Integer.parseInt(input);

            if (freeSpace <= needSpace) {
                System.out.printf("No more free space! You need %d Cubic meters more.", needSpace - freeSpace);
                break;
            }
            input = scanner.nextLine();
        }

        if (freeSpace > needSpace) {
            System.out.printf("%d Cubic meters left.", freeSpace - needSpace);
        }
    }
}
