public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(5.0f,6.0f,1.0f,1.0f);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
