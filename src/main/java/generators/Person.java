package generators;

import printables.PrintableShape;
import utils.GeometricShapeColor;
import utils.GeometricShapeFactory;
import utils.GeometricShapeType;

import java.util.Collection;
import java.util.Random;

public class Person implements Runnable {
    private final String name;
    private final Collection<PrintableShape> shapes;
    private final int numShapes;

    public Person(String name, Collection<PrintableShape> shapes, int numShapes) {
        this.name = name;
        this.shapes = shapes;
        this.numShapes = numShapes;

        System.out.println("Created " + name);
    }

    @Override
    public void run() {
        for (int i = 0; i < numShapes; i++) {
            PrintableShape shape = createRandomShape();
            shapes.add(shape);

            System.out.println(name + " generated " + shape.getName() + " with color " + shape.getColor());

            try {
                Thread.sleep(1000); // simulate some delay before generating next shape
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private PrintableShape createRandomShape() {
        Random random = new Random();
        GeometricShapeType shapeType = GeometricShapeType.values()[random.nextInt(GeometricShapeType.values().length)];
        GeometricShapeColor color = GeometricShapeColor.values()[random.nextInt(GeometricShapeColor.values().length)];

        return new PrintableShape(new GeometricShapeFactory().createShape(shapeType, color, 100));
    }
}
