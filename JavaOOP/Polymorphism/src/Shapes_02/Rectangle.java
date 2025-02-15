package Shapes_02;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        super.setArea(width * height);
        return super.getArea();
    }

    @Override
    public double calculatePerimeter() {
        super.setPerimeter(2 * height + 2 * width);
        return super.getPerimeter();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
