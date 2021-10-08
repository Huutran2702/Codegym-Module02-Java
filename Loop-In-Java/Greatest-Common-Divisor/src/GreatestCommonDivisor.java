import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer a");
        int a = sc.nextInt();
        System.out.println("Enter integer b");
        int b = sc.nextInt();
        System.out.println("Greatest common divisor is: " + findGreatestCommonDivisor(a, b));
    }

    private static int findGreatestCommonDivisor(int a, int b) {
        int result = 0;
        if (a == 0) {
            result = b;
        } else if (b == 0) {
            result = a;
        } else if (b > a) {
            for (int i = a; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    result = i;
                    break;
                }
            }
        } else {
            for (int i = b; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}