package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PowTest extends TestBase {

    @DisplayName("Should calculate the correct result of pow function")
    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, pow = {2}")
    @CsvSource({
            "10, 5, 100000",
            "40, 2, 1600",
            "0, 16, 0",
            "10, -2, 0.01",
            "14, 0, 1",
            "4, 2.5, 32",
            "1, 5, 1",
            "25, 0.5, 5"
    })
    public void powTest(double a, double b, double expectedResult) {
        double result = calculator.pow(a, b);
        assertEquals(expectedResult, result, "Invalid result of pow action");
    }
}
