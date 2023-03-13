package absoluteNumber.test;

import absoluteNumber.AbsoluteNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberTest {
    @Test
    @DisplayName("Test FindAbsolute 0")
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test FindAbsolute 1")
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test FindAbsolute -1")
    void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected, result);
    }
}
