package $9_Automated_Testing_TDD.BaiTap.ChuongTrinhTinhKetQuaFizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslateTest {
    @Test
    void testFizz3() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.fizzbuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void testFizz6() {
        int number = 6;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.fizzbuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void testBuzz5() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.fizzbuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testBuzz10() {
        int number = 10;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.fizzbuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz15() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzzTranslate.fizzbuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz30() {
        int number = 30;
        String expected = "FizzBuzz";

        String result = FizzBuzzTranslate.fizzbuzz(number);
        assertEquals(expected, result);
    }
}