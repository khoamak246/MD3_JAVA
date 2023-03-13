package fizzBuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({
            "9, Fizz",
            "10, Buzz",
            "15, FizzBuzz",
            "311, Fizz",
            "659, Buzz"
    })
    void getFizzBuzzTest(int number, String expected) {
       String result = FizzBuzz.getFizzBuzz(number);
       assertEquals(expected, result);
    }
}
