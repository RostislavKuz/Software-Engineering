import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumLines_01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String pathIn = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectoriesExercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(pathIn));

        // 1
        /*
        for (String line : allLines) {
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                char currentSymbol = line.charAt(i);
                sum += currentSymbol;
            }
            System.out.println(sum);
        }
         */

        //2

        allLines.stream()
                .map(line -> line.toCharArray())
                .forEach(arr -> {
                    int sum = 0;
                    for (char symbol : arr) {
                        sum += symbol;
                    }
                    System.out.println(sum);
                });


    }
}
