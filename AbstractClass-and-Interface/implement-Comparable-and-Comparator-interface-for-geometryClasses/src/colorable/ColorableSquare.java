package colorable;
import resizeable.ResizeableSquare;

public class ColorableSquare extends ResizeableSquare implements Colorable{
    public ColorableSquare() {
    }

    public ColorableSquare(double side) {
        super(side);
    }

    public ColorableSquare(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
