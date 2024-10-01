import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectories\\src\\04\\ Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";
        try {
            FileInputStream fileStream =  new FileInputStream(path);
            int oneByte = fileStream.read();
            while (oneByte>=0){
                System.out.print((char) oneByte);
                oneByte = fileStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
