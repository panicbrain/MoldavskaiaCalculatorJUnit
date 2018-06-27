package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class IsNegativeTest extends TestBase {

    @DisplayName("Should return true if the number is negative")
    @ParameterizedTest(name = "{index} => a = {0}, isNegative = {1}")
    @CsvSource({
            "-5, true",
            "0, false"
    })
    public void isNegativeTest(long a, boolean expectedResult) {
        boolean result = calculator.isNegative(a);
        assertEquals(expectedResult, result, "Invalid result of sign verification");
    }

    @DisplayName("Should return false if the number isn't negative")
    @ParameterizedTest(name = "{index} => a = {0}, isNegative = {1}")
    @CsvSource({
            "1, false",
            "500, false",
    })
    public void isNegativeWithPositiveNumbersTest(long a, boolean expectedResult) {
        boolean result = calculator.isNegative(a);
        assertEquals(expectedResult, result, "Invalid result of sign verification");
    }
}
