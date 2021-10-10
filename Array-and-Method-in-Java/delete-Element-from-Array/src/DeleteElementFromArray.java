import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] array = {1,4,7,3,5,6,2,8,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to delete: ");
        int number_delete = sc.nextInt();
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (number_delete == array[i]) {
                index_del = i;
            }
        }
        if (index_del == -1) {
            System.out.println("The number you entered is " +
                    "not in the array ");
        } else {
            int j = index_del;
            while (j < array.length-1) {
                array[j] = array[j +1];
                j++;
            }
        }
        array[array.length-1] = 0;
        System.out.println(Arrays.toString(array));
    }
}
