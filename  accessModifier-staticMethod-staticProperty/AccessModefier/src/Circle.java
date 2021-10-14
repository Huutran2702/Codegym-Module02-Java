public class Circle {
    protected double radius = 1.0;
    protected String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

     protected double getRadius() {
        return radius;
    }
     protected double getArea() {
        return radius*radius*Math.PI;
    }
}
