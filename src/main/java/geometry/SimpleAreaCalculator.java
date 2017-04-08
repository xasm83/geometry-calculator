package geometry;

import geometry.api.AreaCalculator;
import geometry.api.Shape;

import java.util.Collection;

public class SimpleAreaCalculator implements AreaCalculator {

    public double getTotalArea(Collection<Shape> shapes) {
        return shapes.stream().
                map(Shape::getArea).reduce(0d, Double::sum);
    }
}
