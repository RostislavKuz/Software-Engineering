import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoFiles_07 {
    public static void main(String[] args) throws IOException {

        String pathFileOne = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectoriesExercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathFileTwo = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectoriesExercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        PrintWriter writer = new PrintWriter("outputMerge.txt");

        List<String> allLinesFileOne = Files.readAllLines(Path.of(pathFileOne));
        allLinesFileOne.forEach(line -> writer.println(line));
        List<String> allLinesFileTwo = Files.readAllLines(Path.of(pathFileTwo));
        allLinesFileTwo.forEach(line -> writer.println(line));

        writer.close();

    }
}
