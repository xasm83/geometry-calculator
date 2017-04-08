package geometry.shape;

import geometry.api.Shape;

public class Rectangle implements Shape {

    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Side's length can't be negative");
        }
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getCircumference() {
        return 2 * (width + height);
    }


}
