import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine()); //обем на басейна
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double p1 = pipe1 * time;
        double p2 = pipe2 * time;
        double total = p1 + p2;

        double totalPercent = total / volume * 100;
        double pipe1Percent = p1 / total * 100;
        double pipe2Percent = p2 / total * 100;

        if (total <= volume) {

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", totalPercent, pipe1Percent, pipe2Percent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", time, total - volume);
        }
    }
}
