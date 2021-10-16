package resizeable;

public class Test {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new ResizeableCircle(10.0);
        resizeables[1] = new ResizeableRectangle(10.0,15.0);
        resizeables[2] = new ResizeableSquare(15.0);
        System.out.println("Pre-resize");
        for (Resizeable resizeable: resizeables) {
            if (resizeable instanceof ResizeableCircle) {
                System.out.println(((ResizeableCircle) resizeable).getArea());
            }
            if (resizeable instanceof ResizeableRectangle) {
                System.out.println(((ResizeableRectangle) resizeable).getArea());
            }
            if (resizeable instanceof ResizeableSquare) {
                System.out.println(((ResizeableSquare) resizeable).getArea());
            }
        }
        System.out.println("After-resize");
        for (Resizeable resizeable: resizeables) {
            double percent = Math.round(Math.random()*(100+1-1)-1);
            if (resizeable instanceof ResizeableCircle) {
                System.out.println(percent);
                resizeable.resize(percent);
                System.out.println(((ResizeableCircle) resizeable).getArea());
            }
            if (resizeable instanceof ResizeableRectangle) {
                System.out.println(percent);
                resizeable.resize(percent);
                System.out.println(((ResizeableRectangle) resizeable).getArea());
            }
            if (resizeable instanceof ResizeableSquare) {
                System.out.println(percent);
                resizeable.resize(percent);
                System.out.println(((ResizeableSquare) resizeable).getArea());
            }
        }

    }
}
