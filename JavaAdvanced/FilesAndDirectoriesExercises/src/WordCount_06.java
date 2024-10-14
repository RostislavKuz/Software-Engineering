import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount_06 {
    public static void main(String[] args) throws IOException {

        String pathWords = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectoriesExercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        Map<String, Integer> countWords = new HashMap<>();

        List<String> allLinesWithWords = Files.readAllLines(Path.of(pathWords));

        for (String lineWithWords : allLinesWithWords) {
            Arrays.stream(lineWithWords.split("\\s+"))
                    .forEach(word -> {
                        countWords.put(word, 0);
                    });
        }

        String path = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectoriesExercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        List<String> allLines = Files.readAllLines(Path.of(path));
        for (String line : allLines) {
            Arrays.stream(line.split("\\s+")).forEach(word ->
            {
                if (countWords.containsKey(word)) {
                    int currentCount = countWords.get(word);
                    countWords.put(word, currentCount + 1);
                }
            });
        }

        PrintWriter writer = new PrintWriter("results.txt");

        countWords.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));

        writer.close();


    }
}
