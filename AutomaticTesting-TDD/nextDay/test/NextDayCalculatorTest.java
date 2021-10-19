import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testFindNextDay() {
        int day = 20;
        int month = 11;
        int year = 1995;
        String expected ="Ngày "+21 +" Tháng " +11 + " Năm "+ 1995 ;
        String result = NextDayCalculator.findNextDay(day,month,year);
        assertEquals(expected,result);

    }
    @Test
    void testFindNextDay1() {
        int day = 31;
        int month = 12;
        int year = 1995;
        String expected ="Ngày "+ 1 +" Tháng " +1 + " Năm "+ 1996 ;
        String result = NextDayCalculator.findNextDay(day,month,year);
        assertEquals(expected,result);

    }
    @Test
    void testFindNextDay2() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected ="Ngày "+ 1 +" Tháng " +3 + " Năm "+ 2018 ;
        String result = NextDayCalculator.findNextDay(day,month,year);
        assertEquals(expected,result);

    }
    @Test
    void testFindNextDay3() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected ="Ngày "+ 1 +" Tháng " +3 + " Năm "+2020 ;
        String result = NextDayCalculator.findNextDay(day,month,year);
        assertEquals(expected,result);

    }
}