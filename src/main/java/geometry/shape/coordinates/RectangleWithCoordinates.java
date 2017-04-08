package geometry.shape.coordinates;

import geometry.shape.Rectangle;

public class RectangleWithCoordinates extends Rectangle {
    private Point leftTop;
    private Point rightBottom;

    public RectangleWithCoordinates(Point leftTop, Point rightBottom) {
        super(rightBottom.getX() - leftTop.getX(),
                leftTop.getY() - rightBottom.getY());
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public Point getLeftTop() {
        return leftTop;
    }

    public Point getRightBottom() {
        return rightBottom;
    }
}
