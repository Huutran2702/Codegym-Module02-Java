import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            System.out.println("Enter the quantity of elements in the array");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("The quantity of element in the array " +
                        "must be greater than 0");
            }
        } while (N <= 0);
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the " + (i + 1) + " element.");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Enter number you want to add");
        int number = sc.nextInt();
        System.out.println("Enter index you want to add");
        int index = sc.nextInt();
        int[] newArray = new int[array.length + 1];
        if (index <= -1 || index > array.length - 1) {
            System.out.println("Unable to insert element into array");
        } else {
            for (int i = 0; i < array.length + 1; i++) {
                if (i < index) {
                    newArray[i] = array[i];
                } else if (i == index) {
                    newArray[i] = number;
                } else {
                    newArray[i] = array[i - 1];
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
