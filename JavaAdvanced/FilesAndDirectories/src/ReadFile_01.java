import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadFile_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectories\\src\\04\\ Java-Advanced-Streams-Files-and-Directories-Resources\\Files-and-Streams\\input.txt";

        try (InputStream in = new FileInputStream(path)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = in.read();
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }



    }
}
