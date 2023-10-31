package models.geometry;

public abstract class AbstractShape implements Shape {

    protected double thick;
    private String color;

    public AbstractShape(double thick, String color) {
        this.thick = thick;
        this.color = color;
    }

    public double getThick() {
        return thick;
    }

    public void setThick(double thick) {
        this.thick = thick;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
