import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point2D point2D1 = new Point2D(5.0f,8.0f);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D1);
        System.out.println(Arrays.toString(point2D1.getXY()));
    }
}
