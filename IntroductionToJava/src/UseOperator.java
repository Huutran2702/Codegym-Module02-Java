import java.util.Scanner;

public class UseOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
       float width = scanner.nextFloat();
        System.out.println("Enter height");
       float height = scanner.nextFloat();
        System.out.println("area = " + width * height);

    }
}

