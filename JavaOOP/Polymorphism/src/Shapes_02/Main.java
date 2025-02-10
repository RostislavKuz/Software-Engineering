package Shapes_02;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(4.5, 5.3);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());

        shape = new Circle(10);
    }
}
