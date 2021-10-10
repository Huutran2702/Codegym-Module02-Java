import java.util.Arrays;
import java.util.Scanner;

public class FindLargestElementInTwoDimensionalArray {
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
        double maxValue = matrix[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Max value in matrix is: " + maxValue + " at row "+ (x+1) + " column " + (y+1));
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
