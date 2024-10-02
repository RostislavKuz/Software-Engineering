import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WriteFile_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathIn = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectories\\src\\04\\ Java-Advanced-Streams-Files-and-Directories-Resources\\Files-and-Streams\\input.txt";
        String pathOut = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectories\\src\\04\\ Java-Advanced-Streams-Files-and-Directories-Resources\\02.WriteToFileOutput.txt";

        Set<Character> forbiddenSymbols = new HashSet<>();
        Collections.addAll(forbiddenSymbols, '.', ',', '!', '?');

        try (FileInputStream in = new FileInputStream(pathIn);
             FileOutputStream out = new FileOutputStream(pathOut)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                char myByteAsChar = (char) oneByte;
                if (!forbiddenSymbols.contains(myByteAsChar)) {
                    out.write(oneByte);
                }
                oneByte = in.read();
            }


        } catch (IOException e) {
            System.out.println("Sorry");
        }

    }
}
