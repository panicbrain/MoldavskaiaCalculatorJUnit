package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class SubtractionLongTest extends TestBase {

    @DisplayName("Should calculate the correct subtraction result with long type number")
    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, sub = {2}")
    @CsvSource({
            "5, 10, -5",
            "200, 150, 50",
            "0, 0, 0",
            "0, 16, -16",
            "24, 0, 24",
            "-2, 10, -12",
            "12, -2, 14",
            "15, 28, -13"
    })
    public void subtractionLongTest(long a, long b, long expectedResult){
        long result = calculator.sub(a, b);
        assertEquals(result, expectedResult, "Invalid result of long subtraction");
    }


}
