package models.geometry;

public class Circle extends AbstractShape{

    public static final double PI = 3.141592;
    private double radius;

    public Circle(double thick, String color, double radius) {
        super(thick, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI*(radius + thick)*(radius + thick);
    }

}
