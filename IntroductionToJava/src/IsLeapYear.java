import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn nhập năm cần kiểm tra");
        int year = scanner.nextInt();
        if (year %4 ==0 ) {
            if (year %100 !=0) {
                System.out.println("Năm " + year + "là năm nhuận");
            } else {
                if (year %400 !=0) {
                    System.out.println("Năm " + year + "không phải là năm nhuận");
                } else {
                    System.out.println("Năm " + year + "là năm nhuận");
                }
            }
        } else {
            System.out.println("Năm " + year + "không phải là năm nhuận");
        }
    }
}
