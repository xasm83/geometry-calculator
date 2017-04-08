package shape;

import geometry.shape.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    private int errorFactor = 10;
    private double height = 3;
    private double width = 2;
    Rectangle rectangle = new Rectangle(width, height);

    @Test
    public void testGetArea() {
        double referenceArea = 6;
        assertEquals(referenceArea, rectangle.getArea(), errorFactor * Math.ulp(referenceArea));
    }

    @Test
    public void testGetCircumference() {
        double referenceCircumference = 10;
        assertEquals(referenceCircumference, rectangle.getCircumference(), errorFactor * Math.ulp(referenceCircumference));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorValidation() {
        new Rectangle(-1, 4);
    }
}
