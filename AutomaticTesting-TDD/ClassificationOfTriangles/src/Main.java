import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double triangleEdge1 = enterTriangleEdge();
        double triangleEdge2 = enterTriangleEdge();
        double triangleEdge3 = enterTriangleEdge();
        int result = TriangleClassifier.classify(triangleEdge1, triangleEdge2, triangleEdge3);
        printResult(result);
    }

    private static void printResult(int result) {
        switch (result) {
            case 3:
                System.out.println("Đây là tam giác đều");
                break;
            case 2:
                System.out.println("Đây là tam giác cân");
                break;
            case 1:
                System.out.println("Đây là tam giác thường");
                break;
            case 0:
                System.out.println("Đây không phải tam giác");

        }
    }

    public static double enterTriangleEdge() {
        double triangleEdge;
        System.out.println("Nhập độ dài cạnh tam giác");
        triangleEdge = scanner.nextDouble();
        while (triangleEdge < 0) {
            System.out.println("Độ dài cạnh tam giác phải lớn hơn 0");
            triangleEdge = scanner.nextDouble();
        }
        return triangleEdge;
    }
}
