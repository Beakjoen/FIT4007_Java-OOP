package Rectangle;
public class Rectangle {
    private double height;
    private double width;
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public double calculateArea() {
        return height * width;
    }
    public double calculatePerimeter() {
        return 2 * (height + width);
    }
    @Override
    public String toString() {
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        return "Rectangle: \nHeight: " + height + ", Width: " + width +
               "\nArea: " + area + ", Perimeter: " + perimeter;
    }
}
