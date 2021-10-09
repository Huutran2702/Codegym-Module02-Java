import java.util.Scanner;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = sc.nextInt();
            if (size>20) {
                System.out.println("Size should not exceed 20 ");
            }
        } while (size>20);
        double[] money = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter money, billions USD");
            money[i] = sc.nextDouble();
        }
        double max = money[0];
        for (int i = 0; i < size; i++) {
            if (money[i]>max) {
                max = money[i];
            }
        }
        System.out.println("Max money is: "+ max +" billions USD");
    }
}
