import java.util.Arrays;
import java.util.Scanner;

public class SumNumbersAtTheMainDiagonal {
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
            matrix[i] = enterElementInArray( enterSizeArray(i,matrixSize), i);
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Sum of elements at the main diagonal 1 is :");
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == j) {
                    sum1 += matrix[i][j];
                }
                if (i + j == matrixSize-1) {
                    sum2 += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of elements at the main diagonal 1 is : " +sum1);
        System.out.println("Sum of elements at the main diagonal 2 is : " +sum2);
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
    private static int enterSizeArray(int stt,int limit) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter the quantity of element in row " + (stt+1));
            size = scanner.nextInt();
            if (size != limit) {
                System.out.println("The quantity of element must be equal " + limit);
            }

        } while (size != limit);
        return size;
    }
}

