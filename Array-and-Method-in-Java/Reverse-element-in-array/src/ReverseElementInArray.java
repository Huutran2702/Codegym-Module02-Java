import java.util.Scanner;

public class ReverseElementInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if (size>20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size>20);
        array = new int[size];
        for (int i = 0;i<size;i++) {
            System.out.println("Enter element " +(i+1) + " in array.");
            array[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        int temp;
        for (int x = 0; x < array.length/2; x++) {
            temp = array[x];
            array[x] = array[size-1-x];
            array[size-1-x] = temp;
        }
        System.out.println();
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}
