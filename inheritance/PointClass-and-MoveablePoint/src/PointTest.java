import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        Object point1 = new Point(10.0f, 11.0f);
        if (point1 instanceof Point) {
            float[] array = ((Point) point1).getXY();
            System.out.println(Arrays.toString(array));
        }
        System.out.println(point);
    }
}
