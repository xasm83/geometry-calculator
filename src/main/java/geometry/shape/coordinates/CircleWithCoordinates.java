package geometry.shape.coordinates;

import geometry.shape.Circle;

public class CircleWithCoordinates extends Circle {
    private Point center;

    public CircleWithCoordinates(Point center, double radius) {
        super(radius);
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }
}
