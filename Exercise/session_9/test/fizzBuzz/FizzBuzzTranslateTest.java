package fizzBuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslateTest {
    @ParameterizedTest
    @CsvSource({
            "26, hai sau",
            "30, ba muoi",
            "10, muoi",
            "5, nam",
            "69, sau chin",
            "-69, am sau chin",
            "0, khong"
    })
    void getFizzBuzzTranslateTest(int number, String expected){
        String result = FizzBuzz.fizzBuzzTranslate(number);
        assertEquals(expected, result);
    }
}
