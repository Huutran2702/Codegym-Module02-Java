

public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year) {
        String result = "";
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    result = getResult(29,day, month, year);
                } else {
                    result = getResult(28,day, month, year);
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                result = getResult(31,day, month, year);
                break;
            case 12:
                result = getResultWithDecember(day, month, year);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = getResult(30,day, month, year);
                break;
        }
        return result;

    }

    private static String getResultWithDecember(int day, int month, int year) {
        String result;
        if (day < 31) {
            day = day + 1;
            result = "Ngày " + day + " Tháng " + month + " Năm " + year;
        } else if (day == 31) {
            day = 1;
            month = 1;
            year = year + 1;
            result = "Ngày " + day + " Tháng " + month + " Năm " + year;
        } else {
            result = "Tháng " + month +
                    " năm " +
                    year +
                    " không có " +
                    day +
                    " ngày.";
        }
        return result;
    }

    private static String getResult(int maxDayOfMonth,int day, int month, int year) {
        String result;
        if (day < maxDayOfMonth) {
            day = day + 1;
          result = "Ngày " + day + " Tháng " + month + " Năm " + year;
        } else if (day == maxDayOfMonth) {
            day = 1;
            month = month + 1;
            result = "Ngày " + day + " Tháng " + month + " Năm " + year;
        } else {
            result = "Tháng " + month +
                    " năm " +
                    year +
                    " không có " +
                    day +
                    " ngày.";
        }
        return result;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else {
                return year % 400 == 0;
            }
        } else {
            return false;
        }
    }

}
