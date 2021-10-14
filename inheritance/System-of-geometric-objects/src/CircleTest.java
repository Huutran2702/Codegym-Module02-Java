public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle("Red",false,6.0);

        System.out.println(circle);
        System.out.println(circle2);
        System.out.println(circle1);
    }
}
