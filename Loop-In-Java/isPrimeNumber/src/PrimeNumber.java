import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        isPrimeNumber(number);
    }
    private static void isPrimeNumber(int number) {
        boolean check = true;
        if (number<2) {
            System.out.println(number + " không phải là số nguyên tố");
        }
        for (int i = 2;i<number-1;i++) {
            if (number%i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không phải là số nguyên tố");
        }
    }
}
