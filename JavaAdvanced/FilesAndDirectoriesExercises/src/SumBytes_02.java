import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumBytes_02 {
    public static void main(String[] args) throws IOException {
        String path = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectoriesExercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        long sum = 0;

        // 1
        /*
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();

        while (line != null) {
            for (int i = 0; i < line.length(); i++) {
                char currentSymbol = line.charAt(i);
                sum += currentSymbol;
            }
            line = br.readLine();
        }
        System.out.println(sum);
         */

        // 2

        byte[] allBytes = Files.readAllBytes(Path.of(path));
        for (byte ascii : allBytes) {
            if (ascii != 10 && ascii != 13) {
                sum += ascii;
            }
        }
        System.out.println(sum);
    }
}
