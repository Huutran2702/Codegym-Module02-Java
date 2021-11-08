package using_IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap canh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap canh c: ");
        double c = sc.nextDouble();
        Triangle triangle = new Triangle();
         triangle.checkTriangle(a,b,c);
    }
    private void checkTriangle(double a, double b, double c) {
        if (a<0.0||b<0.0||c<0.0) {
            throw new IllegalArgumentException("Canh tam giac phai lon hon 0");
        } else if (a+b>c||a+c>b||b+c>a) {
            System.out.println("3 canh " +a+", "+b+", "+c+", "+"la 3 canh cua tam giac");
        } else {
            throw new IllegalArgumentException("3 canh " +a+", "+b+", "+c+", "+"khong phai la 3 canh cua tam giac");
        }
    }
}
