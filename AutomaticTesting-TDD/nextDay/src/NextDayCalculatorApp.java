import java.util.Scanner;

public class NextDayCalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày ");
        int day = sc.nextInt();
            while (day<1) {
                System.out.println("Không tìm thấy ngày bạn vừa nhập");
                System.out.print("Nhập lại ngày ");
                day = sc.nextInt();
            }
        System.out.print("Nhập tháng ");
        int month = sc.nextInt();
        while (month<1 || month>12) {
            System.out.println("Không tìm thấy tháng bạn vừa nhập");
            System.out.print("Nhập lại tháng ");
            month = sc.nextInt();
        }
        System.out.print("Nhập năm ");
        int year = sc.nextInt();
        while (year < 0) {
            System.out.println("Không tìm thấy năm bạn vừa nhập");
            System.out.print("Nhập lại năm ");
            year = sc.nextInt();
        }
        System.out.println("Ngày tiếp theo của ngày "+day+" tháng "+ month+ " năm "+ year+" là: ");
        System.out.println(NextDayCalculator.findNextDay(day,month,year));
    }
}
