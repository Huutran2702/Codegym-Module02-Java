import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        Point3D point3D1 = new Point3D(5.0f,8.0f,20.0f);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D1);
        System.out.println(Arrays.toString(point3D1.getXYZ()));
    }

}
