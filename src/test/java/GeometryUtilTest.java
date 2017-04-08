import geometry.shape.coordinates.GeometryUtil;
import geometry.shape.coordinates.Point;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeometryUtilTest {
    private int errorFactor = 10;

    @Test
    public void testGeometryUtilIntervalLength() {
        double length = GeometryUtil.getIntervalLength(new Point(1, 4), new Point(2, 5));
        double referenceLengthValue = 1.414213562373095;
        assertEquals(referenceLengthValue, length, errorFactor * Math.ulp(length));
    }
}
