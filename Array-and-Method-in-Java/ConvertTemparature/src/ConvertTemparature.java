import java.util.Scanner;

public class ConvertTemparature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double input;
        double result;
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Fahrenheit temparature");
                input = sc.nextDouble();
                result = (5.0 / 9) * (input - 32);
                System.out.println(input + " Fahrenheit = " + result + " Celsius" );
                break;
            case 2:
                System.out.println("Enter Celsius temparature");
                input = sc.nextDouble();
                result = (9.0/5)*input + 32 ;
                System.out.println(input + " Celsius = " + result + " Fahrenheit" );
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("no choice!");
        }
    }
}
