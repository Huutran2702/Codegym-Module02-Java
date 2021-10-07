import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Weight , in kilogam");
        double weight = scanner.nextDouble();
        System.out.println("Enter your Height, in meter");
        double height = scanner.nextDouble();
        double bmi = weight/Math.pow(height,2);
        if (bmi<18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
