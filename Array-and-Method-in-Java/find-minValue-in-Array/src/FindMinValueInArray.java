import java.util.Arrays;
import java.util.Scanner;

public class FindMinValueInArray {
    public static void main(String[] args) {
        int size = enterSizeArray();
        double[] array = enterElementInArray(size);
        double minValue = array[0];
        int x = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] <minValue) {
                minValue = array[i];
                x = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Min value in array is: " + minValue+ " at position "+(x+1));
    }
    private static double[] enterElementInArray(int size) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + (i + 1) + " element of array ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
    private static int enterSizeArray() {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter the quantity of element in aray " );
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("The quantity of element must be greater than 0 ");
            }
        } while (size <= 0);
        return size;
    }
}
