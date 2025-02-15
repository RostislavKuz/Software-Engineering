package Shapes_02;

public abstract class Shape {
    private double perimeter;
    private double area;

    public abstract double calculatePerimeter();
    public abstract double calculateArea();

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
