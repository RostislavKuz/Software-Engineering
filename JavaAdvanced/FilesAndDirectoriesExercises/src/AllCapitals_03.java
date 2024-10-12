import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class AllCapitals_03 {
    public static void main(String[] args) throws IOException {
        String path = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectoriesExercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        // 1
        /*
        List<String> allLines = Files.readAllLines(Path.of(path));

        for (String line : allLines) {
            writer.write(line.toUpperCase());
            writer.newLine();
        }
        writer.close();
         */

        // 2
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();

        while (line!=null){
            writer.write(line.toUpperCase());
            writer.newLine();

            line = reader.readLine();
        }
        writer.close();


    }
}
