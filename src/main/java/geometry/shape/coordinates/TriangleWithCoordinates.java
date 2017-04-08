package geometry.shape.coordinates;

import geometry.shape.Triangle;

public class TriangleWithCoordinates extends Triangle {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;

    public TriangleWithCoordinates(Point vertex1, Point vertex2, Point vertex3) {
        super(GeometryUtil.getIntervalLength(vertex1, vertex2),
                GeometryUtil.getIntervalLength(vertex2, vertex3),
                GeometryUtil.getIntervalLength(vertex3, vertex1));
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }
}
