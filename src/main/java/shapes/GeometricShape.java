package main.java.shapes;

public abstract class GeometricShape implements ShapePerimeter, ShapeArea {
    protected String name;
    private String color;

    public GeometricShape(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
