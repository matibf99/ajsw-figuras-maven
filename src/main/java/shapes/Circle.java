package main.java.shapes;

import main.java.utils.GeometricShapeType;

public class Circle extends GeometricShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.name = GeometricShapeType.CIRCLE.toString();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
