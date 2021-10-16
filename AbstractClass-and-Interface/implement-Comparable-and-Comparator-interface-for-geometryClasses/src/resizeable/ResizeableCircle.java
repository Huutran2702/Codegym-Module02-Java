package resizeable;
import circle.Circle;

public class ResizeableCircle extends Circle implements Resizeable{
    public ResizeableCircle() {
    }

    public ResizeableCircle(double radius) {
        super(radius);
    }

    public ResizeableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public void resize(double percent) {
        setRadius(super.getRadius()*percent);
    }
}
