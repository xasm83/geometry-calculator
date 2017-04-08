package geometry.api;

import java.util.Collection;

public interface AreaCalculator {
    /**
     * Calculates total area of passed shapes.
     *
     * @param shapes collection of shape to process
     * @return calculated total area
     */
    double getTotalArea(Collection<Shape> shapes);
}
