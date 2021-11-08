package Illustration_of_insertion_sort_algorithm;

public class InsertionSort {
    public static int[] list = {1,3,5,9,7,8,4,6,9};
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            System.out.println(x);
            pos = i;
            System.out.println(pos);
            while(pos > 0 && x < array[pos-1]){
                System.out.println("Phần tử thứ "+pos+ " gán bằng " +array[pos-1]);
                array[pos] = array[pos-1];

                pos--;
                System.out.println(pos);
            }
            array[pos] = x;
            System.out.println(array[pos]);
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length ; i++) {
            System.out.print(list[i]+ " ");
        }
    }
}
