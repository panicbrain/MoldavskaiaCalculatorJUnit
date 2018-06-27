package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsPositiveTest extends TestBase {

    @DisplayName("Should return true if the number is positive")
    @ParameterizedTest(name = "{index} => a = {0}, isPositive = {1}")
    @CsvSource({
            "1, true",
            "500, true",
    })
    public void isPositiveTest(long a, boolean expectedResult) {
        boolean result = calculator.isPositive(a);
        assertEquals(expectedResult, result, "Invalid result of sign verification");
    }

    @DisplayName("Should return false if the number isn't positive")
    @ParameterizedTest(name = "{index} => a = {0}, isPositive = {1}")
    @CsvSource({
            "-5, false",
            "0, false",
    })
    public void isPositiveWithNegativeNumberTest(long a, boolean expectedResult) {
        boolean result = calculator.isPositive(a);
        assertEquals(expectedResult, result, "Invalid result of sign verification");
    }
}
