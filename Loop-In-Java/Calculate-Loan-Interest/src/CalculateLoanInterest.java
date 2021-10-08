import java.util.Scanner;

public class CalculateLoanInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money: ");
        int money = sc.nextInt();
        System.out.println("Enter interest rate , %/year: ");
        double InterestRate = sc.nextDouble();
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        System.out.println("Total interest = " +calculateInterest(money,InterestRate,month));
    }

    private static double calculateInterest(int a, double b, int c) {
        double totalInterst = 0;
        for (int i = 0;i<c;i++) {
            totalInterst += a*(b/100)/12*c;
        }
        return totalInterst;
    }
}
