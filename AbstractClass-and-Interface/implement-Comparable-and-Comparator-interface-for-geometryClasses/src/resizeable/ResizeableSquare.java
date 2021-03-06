package resizeable;
import rectangle.Rectangle;

public class ResizeableSquare extends Rectangle implements Resizeable {
    public ResizeableSquare() {
    }

    public ResizeableSquare(double side) {
        super(side, side);
    }

    public ResizeableSquare(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

//    @Override
//    public void setWidth(double width) {
//        setSide(width);
//    }
//
//    @Override
//    public void setLength(double length) {
//        setSide(length);
//    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        setSide(getSide()*percent);
    }
}
