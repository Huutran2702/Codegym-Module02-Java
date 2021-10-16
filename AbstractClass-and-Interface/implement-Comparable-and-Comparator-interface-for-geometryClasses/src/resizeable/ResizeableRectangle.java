package resizeable;
import rectangle.Rectangle;

public class ResizeableRectangle extends Rectangle implements Resizeable {
    public ResizeableRectangle() {
    }

    public ResizeableRectangle(double width, double length) {
        super(width, length);
    }

    public ResizeableRectangle(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public void resize(double percent) {
        setLength(getLength()*percent);
        setWidth(getWidth()*percent);
    }
}
