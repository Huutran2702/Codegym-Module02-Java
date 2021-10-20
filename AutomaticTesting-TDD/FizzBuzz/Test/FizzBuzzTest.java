import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void getResultTest() {
        int number = 3;
        String result = FizzBuzz.getResult(number);
        String expected = "Fizz";
        assertEquals(expected, result);
    }
    @Test
    void getResultTest1() {
        int number = 5;
        String result = FizzBuzz.getResult(number);
        String expected = "Buzz";
        assertEquals(expected, result);
    }
    @Test
    void getResultTest2() {
        int number = 15;
        String result = FizzBuzz.getResult(number);
        String expected = "FizzBuzz";
        assertEquals(expected, result);
    }
}