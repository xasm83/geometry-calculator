import geometry.SimpleAreaCalculator;
import geometry.api.Shape;
import geometry.shape.Circle;
import geometry.shape.Rectangle;
import geometry.shape.Triangle;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SimpleAreaCalculatorTest {
    private int errorFactor = 10;

    @Test
    public void testAreaCalculation() {
        double referenceTotalArea = 37.179071391963701;

        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(3, 2);
        Shape triangle = new Triangle(2, 3, 4);
        SimpleAreaCalculator calculator = new SimpleAreaCalculator();

        double area = calculator.getTotalArea(Arrays.asList(circle, triangle, rectangle));
        assertEquals(referenceTotalArea, area, errorFactor * Math.ulp(referenceTotalArea));
    }
}
