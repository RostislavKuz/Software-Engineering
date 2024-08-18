import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int time = first + second + third;

        int minutes = time / 60;
        int seconds = time % 60;

        if (seconds>=10){
            System.out.printf("%d:%d", minutes, seconds);
        }else {
            System.out.printf("%d:0%d", minutes, seconds);
        }


    }
}