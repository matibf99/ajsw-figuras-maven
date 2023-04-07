package main.java.operations;

import main.java.shapes.GeometricShape;

import java.util.List;

public class AreaOperation {
    public static double area(GeometricShape shape) {
        return shape.area();
    }

    public static double sumAreas(List<GeometricShape> shapes) {
        return shapes.stream().mapToDouble(x -> area(x)).sum();
    }
}
