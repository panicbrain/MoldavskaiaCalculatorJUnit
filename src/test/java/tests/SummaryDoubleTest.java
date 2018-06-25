package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SummaryDoubleTest extends TestBase {

    @DisplayName("Should calculate the correct sum with double type number")
    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, sum = {2}")
    @CsvSource({
            "5, 10, 15",
            "200, 150, 350",
            "0, 0, 0",
            "0, 16, 16",
            "24, 0, 24",
            "-2, 10, 8",
            "12, -2, 10",
            "1.5, 2.8, 4.3"
    })
    void summaryDoubleTest(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        assertEquals(result, expectedResult, "Invalid result of double summary");
    }
}
