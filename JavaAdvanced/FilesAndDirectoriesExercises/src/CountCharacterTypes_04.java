import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountCharacterTypes_04 {
    public static void main(String[] args) throws IOException {

        int vowelsCount = 0;
        int punctuationCount = 0;
        int consonantsCount = 0;

        Set<Character> vowels = getVowels();
        Set<Character> punctuation = getPunctuation();

        String pathIn = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectoriesExercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(pathIn));


        for (String line : allLines) {
            for (int i = 0; i < line.length(); i++) {
                char currentSymbol = line.charAt(i);

                if (currentSymbol == ' ') {
                    continue;
                }

                if (vowels.contains(currentSymbol)) {
                    vowelsCount++;
                } else if (punctuation.contains(currentSymbol)) {
                    punctuationCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("output_task_4.txt"));
        writer.write("Vowels: " + vowelsCount);
        writer.newLine();
        writer.write("Consonants: " + consonantsCount);
        writer.newLine();
        writer.write("Punctuation: " + punctuationCount);
        writer.close();


    }

    private static Set<Character> getPunctuation() {
        Set<Character> punctuationalMarks = new HashSet<>();
        punctuationalMarks.add('!');
        punctuationalMarks.add(',');
        punctuationalMarks.add('.');
        punctuationalMarks.add('?');
        return punctuationalMarks;
    }

    private static Set<Character> getVowels() {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        return vowels;
    }
}
