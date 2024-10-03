import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyBytes_03 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String pathIn = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectories\\src\\04\\ Java-Advanced-Streams-Files-and-Directories-Resources\\Files-and-Streams\\input.txt";
        String pathOut = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectories\\src\\04\\ Java-Advanced-Streams-Files-and-Directories-Resources\\03.CopyBytesOutput.txt";

        FileInputStream in = new FileInputStream(pathIn);
        FileOutputStream out = new FileOutputStream(pathOut);

        int oneByte = in.read();
        while (oneByte >= 0) {

            if (oneByte == 32 || oneByte == 10) {
                out.write((char) oneByte);
            } else {
                String digits = String.valueOf(oneByte);
                for (int i = 0; i < digits.length(); i++) {
                    out.write(digits.charAt(i));
                }

            }


            oneByte = in.read();
        }

    }
}
