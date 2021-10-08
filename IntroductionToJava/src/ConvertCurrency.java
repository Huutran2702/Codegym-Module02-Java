import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        int exchangeRate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD");
        float usd = sc.nextFloat();
        float vnd = usd*exchangeRate;
        System.out.println(vnd + "VND");
    }
}
