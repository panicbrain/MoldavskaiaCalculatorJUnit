package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultDoubleTest extends TestBase {
    @DisplayName("Should calculate the correct multiplication result with double type number")
    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, mult = {2}")
    @CsvSource({
            "5.5, 10, 55",
            "200, 150, 30000",
            "0, 0, 0",
            "0, 16, 0",
            "24, 0, 0",
            "-2, 10, -20",
            "12, -2, -24",
            "15, 28, 420",
            "1.2, 4.7, 5.64",
            "-1.2, 3.6, -4.32",
            "4.1, -8.45, -34.645"
    })
    public void multiplicationDoubleTest(double a, double b, double expectedResult) {
        double result = calculator.mult(a, b);
        assertEquals(expectedResult, result, "Invalid result of double multiplication");
    }
}
