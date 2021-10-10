public class FindMinValueUseMethod {
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 4, 3, 8, 3, 1, 3, 0};
        System.out.println("Min value in array is:  " + minValue(array));
    }

    private static int minValue(int[] array) {
        int min = array[0];
        for (int s : array) {
            if (s < min) {
                min = s;
            }
        }
        return min;
    }
}
