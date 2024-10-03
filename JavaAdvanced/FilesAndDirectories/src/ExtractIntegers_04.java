import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static void main(String[] args) throws FileNotFoundException {

        String inPath = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectories\\src\\04\\ Java-Advanced-Streams-Files-and-Directories-Resources\\Files-and-Streams\\input.txt";
        String outPath = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectories\\src\\04\\ Java-Advanced-Streams-Files-and-Directories-Resources\\04.ExtractIntegersOutput.txt";

        Scanner scanner = new Scanner(new FileInputStream(inPath));
        PrintWriter myFileOutput = new PrintWriter(new FileOutputStream(outPath));

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int myNumber = scanner.nextInt();
                //System.out.println(myNumber);
                myFileOutput.println(myNumber);
            }
            scanner.next();
        }
        myFileOutput.close();

    }
}
