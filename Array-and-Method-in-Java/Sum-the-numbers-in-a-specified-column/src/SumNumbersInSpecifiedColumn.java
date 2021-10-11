import java.util.Arrays;
import java.util.Scanner;

public class SumNumbersInSpecifiedColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize;
        do {
            System.out.println("Enter the quantity of row in matrix ");
            matrixSize = sc.nextInt();
            if (matrixSize <= 0) {
                System.out.println("The quantity of row must be greater than 0 ");
            }
        } while (matrixSize <= 0);
        double[][] matrix;
        matrix = new double[matrixSize][];
        for (int i = 0; i < matrixSize; i++) {
            matrix[i] = enterElementInArray( enterSizeArray(i), i);
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Enter column you want to sum");
        int column = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < matrixSize; i++) {
            sum += matrix[i][column];
        }
        System.out.println("Sum of elements in column "+ column+ " is " +sum);
    }
    private static double[] enterElementInArray(int size, int stt) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + (i + 1) + " element of row " + (stt+1));
            array[i] = scanner.nextInt();
        }
        return array;
    }
    private static int enterSizeArray(int stt) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter the quantity of element in row " + (stt+1));
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("The quantity of element must be greater than 0 ");
            }
        } while (size <= 0);
        return size;
    }

}
