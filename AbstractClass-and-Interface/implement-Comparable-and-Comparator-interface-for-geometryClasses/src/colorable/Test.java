package colorable;

public class Test {
    public static void main(String[] args) {
       Object[] colorables = new Colorable[3];
        colorables[0] = new ColorableSquare();
        colorables[1] = new ColorableSquare();
        colorables[2] = new ColorableSquare(12.0,"yellow",true);
        for (Object colorable: colorables) {
            if (colorable instanceof Colorable) {
               ((Colorable) colorable).howToColor();
            }
        }

    }
}
