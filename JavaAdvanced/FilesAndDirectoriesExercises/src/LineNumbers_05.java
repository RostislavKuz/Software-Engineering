import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LineNumbers_05 {
    public static void main(String[] args) throws IOException {

        String pathIn = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectoriesExercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";

        List<String> allLines = Files.readAllLines(Path.of(pathIn));
        PrintWriter writer = new PrintWriter("output_line_numbers.txt");

        int counter = 1;
        for (String line : allLines) {
            writer.println(counter + ". " + line);
            counter++;
        }
        writer.close();



    }
}
