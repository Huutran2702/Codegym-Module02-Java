import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a");
        float a = scanner.nextFloat();
        System.out.println("Nhập hệ số b");
        float b = scanner.nextFloat();
        System.out.println("Nhập hệ số c");
        float c = scanner.nextFloat();
        if (a != 0) {
            System.out.println("Nghiệm của phương trình là : x = " + (c - b) / a);
        } else if (b == 0 && c == 0) {
            System.out.println("Phương trình có vô số nghiệm");
        } else if (b!=0 && b==c){
            System.out.println("Phương trình vô số nghiệm");
        } else {
            System.out.println("Phương trình vô  nghiệm");
        }
    }
}
