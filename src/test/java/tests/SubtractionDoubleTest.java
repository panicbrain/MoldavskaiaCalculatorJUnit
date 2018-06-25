package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubtractionDoubleTest extends TestBase {

    @DisplayName("Should calculate the correct subtraction result with double type number")
    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, sub = {2}")
    @CsvSource({
            "5, 10, -5",
            "200, 150, 50",
            "0, 0, 0",
            "0, 16, -16",
            "24, 0, 24",
            "-2, 10, -12",
            "12, -2, 14",
            "1.5, 2.8, -1.3"
    })
    void subtractionDoubleTest(double a, double b, double expectedResult) {
        double result = calculator.sub(a, b);
        int checkResult = Double.compare(result, expectedResult);
        assertTrue(checkResult == 0, "Invalid result of double subtraction");
    }
}
