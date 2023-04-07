package printables;

import shapes.GeometricShape;

public class PrintableShape {
    private GeometricShape shape;
    private boolean printed;

    public PrintableShape(GeometricShape shape) {
        this.shape = shape;
        this.printed = false;
    }

    public String getName() {
        return shape.getName();
    }

    public String getColor() {
        return shape.getColor();
    }

    public boolean isPrinted() {
        return printed;
    }

    public void setPrinted(boolean printed) {
        this.printed = printed;
    }
}
