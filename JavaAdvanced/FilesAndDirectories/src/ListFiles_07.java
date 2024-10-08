import java.io.File;

public class ListFiles_07 {
    public static void main(String[] args) {

        File file = new File("G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectories\\src\\04\\ Java-Advanced-Streams-Files-and-Directories-Resources\\Files-and-Streams");

        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory()) {
                        System.out.printf("%s: %s%n", f.getName(), f.length());
                    }

                }

            }
        }


    }
}
