package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultLongTest extends TestBase {
    @DisplayName("Should calculate the correct result of multiplication of double type number")
    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, mult = {2}")
    @CsvSource({
            "5, 10, 50",
            "200, 150, 30000",
            "0, 0, 0",
            "0, 16, 0",
            "24, 0, 0",
            "-2, 10, -20",
            "12, -2, -24",
            "15, 28, 420"})
    public void multiplicationLongTest(long a, long b, long expectedResult){
        long result = calculator.mult(a, b);
        assertEquals(expectedResult, result, "Invalid result of long multiplication");
    }
}
