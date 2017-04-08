package shape;

import geometry.shape.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    private int errorFactor = 10;
    private double edge1 = 3;
    private double edge2 = 2;
    private double edge3 = 4;
    private Triangle circle = new Triangle(edge1, edge2, edge3);

    @Test
    public void testGetArea() {
        double referenceArea = 2.9047375096555625;
        assertEquals(referenceArea, circle.getArea(), errorFactor * Math.ulp(referenceArea));
    }

    @Test
    public void testGetCircumference() {
        double referenceCircumference = 9.0;
        assertEquals(referenceCircumference, circle.getCircumference(), errorFactor * Math.ulp(referenceCircumference));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorValidation() {
        new Triangle(1, 2, 5);
    }
}
