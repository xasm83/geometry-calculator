package shape;

import geometry.shape.Circle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    private int errorFactor = 10;
    private double radius = 3;
    private Circle circle = new Circle(radius);

    @Test
    public void testGetArea() {
        double referenceArea = 28.274333882308138;
        assertEquals(referenceArea, circle.getArea(), errorFactor * Math.ulp(referenceArea));
    }

    @Test
    public void testGetCircumference() {
        double referenceCircumference = 18.849555921538758;
        assertEquals(referenceCircumference, circle.getCircumference(), errorFactor * Math.ulp(referenceCircumference));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorValidation() {
        new Circle(-1);
    }
}
