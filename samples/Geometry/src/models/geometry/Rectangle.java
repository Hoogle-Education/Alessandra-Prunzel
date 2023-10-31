package models.geometry;

public class Rectangle extends AbstractShape {

    private double width;
    private double height;

    public Rectangle(double thick, String color, double width, double height) {
        super(thick, color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return height*width;
    }
}
