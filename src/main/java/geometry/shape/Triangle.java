package geometry.shape;

import geometry.api.Shape;

public class Triangle implements Shape {
    protected double edge1;
    protected double edge2;
    protected double edge3;

    public Triangle(double edge1, double edge2, double edge3) {
        if ((edge1 < 0) || (edge2 < 0) || (edge3 < 0)) {
            throw new IllegalArgumentException("Side's length can't be negative.");
        }

        if ((edge3 > edge1 + edge2) || (edge2 > edge1 + edge3) || (edge1 > edge3 + edge2)) {
            throw new IllegalArgumentException("Passed lengths do not hold triangle side length rules.");
        }
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    //Heron's formula is used
    //http://www.mathwarehouse.com/geometry/triangles/area/herons-formula-triangle-area.php
    public double getArea() {
        double p = (edge1 + edge2 + edge3) / 2;
        return Math.sqrt(p * (p - edge1) * (p - edge2) * (p - edge3));
    }

    public double getCircumference() {
        return edge1 + edge2 + edge3;
    }
}
