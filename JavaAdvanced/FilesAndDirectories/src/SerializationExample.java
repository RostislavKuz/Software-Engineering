import java.io.*;

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cube cube = new Cube("blue", 1, 1, 1);
        String path = "G:\\Software-Engineering\\JavaAdvanced\\FilesAndDirectories\\src\\04\\ Java-Advanced-Streams-Files-and-Directories-Resources\\myCube.ser";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(cube);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        Cube cubeFromFile = (Cube) objectInputStream.readObject();
        System.out.println();


    }
}
