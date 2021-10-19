import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAbsolute() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalulator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    void testFindAbsolute1() {
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumberCalulator.findAbsolute(number);
        assertEquals(expected,result);
    }
    void testFindAbsolute2() {
        int number = -2;
        int expected = 2;
        int result = AbsoluteNumberCalulator.findAbsolute(number);
        assertEquals(expected,result);
    }
}