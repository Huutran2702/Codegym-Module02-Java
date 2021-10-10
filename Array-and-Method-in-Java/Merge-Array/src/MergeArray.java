import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MergeArray {
    public static void main(String[] args) {
        int sizeArray1 = enterSizeArray(1);
        int[] array1 = enterElementInArray(sizeArray1, 1);
        int sizeArray2 = enterSizeArray(2);
        int[] array2 = enterElementInArray(sizeArray2, 2);
        int[] array3 = new int[sizeArray1 + sizeArray2];
        IntStream.range(0, sizeArray1).forEach(i -> array3[i] = array1[i]);
        IntStream.range(0, sizeArray2).forEach(j -> array3[j + sizeArray1] = array2[j]);
        System.out.println("Array 3 :" + Arrays.toString(array3));
    }

    private static int enterSizeArray(int stt) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter the quantity of element in array " + stt);
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("The quantity of element must be greater than 0 ");
            }
        } while (size <= 0);
        return size;
    }

    private static int[] enterElementInArray(int size, int stt) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + (i + 1) + " element of array " + stt);
            array[i] = scanner.nextInt();
        }
        return array;
    }

}
