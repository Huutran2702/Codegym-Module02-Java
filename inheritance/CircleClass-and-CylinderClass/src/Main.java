public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        Cylinder cylinder1 = new Cylinder(10.0);
        Cylinder cylinder2 = new Cylinder("blue", 10.0, 20.0);
        System.out.println(cylinder2.getArea());
        System.out.println(cylinder);
        System.out.println(cylinder1);
        System.out.println(cylinder2);
        System.out.println(cylinder2.getVolume());
        System.out.println(cylinder1.getArea());
        System.out.println(cylinder.getColor());
    }
}
