import java.io.File;

public class GetFolderSize_08 {
    public static void main(String[] args) {

        String path = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectoriesExercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(path);
        File[] allFiles = folder.listFiles();

        int folderSize = 0;
        for (File file : allFiles) {
            folderSize += file.length();
        }

        System.out.println("Folder size: " + folderSize);

    }
}
