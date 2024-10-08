import java.io.Serializable;

public class Cube implements Serializable {
    String color;

    int width;
    int length;
    int depth;

    public Cube(String color, int width, int length, int depth) {
        this.color = color;
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

}
