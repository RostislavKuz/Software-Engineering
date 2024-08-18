import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsNeed = 10000;
        int steps = 0;
        boolean isGoingHome = false;


        while (steps < stepsNeed && !isGoingHome) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                isGoingHome = true;
                input = scanner.nextLine();
            }

            steps += Integer.parseInt(input);
        }

        if ((steps >= stepsNeed) || (steps >= stepsNeed && isGoingHome)) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.", stepsNeed - steps);
        }

    }
}
