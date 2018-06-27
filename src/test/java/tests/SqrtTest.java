package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SqrtTest extends TestBase {

    @DisplayName("Should calculate the correct result of sqrt function")
    @ParameterizedTest(name = "{index} => a = {0}, sqrt = {1}")
    @CsvSource({
            "25, 5",
            "400, 20",
            "1.44, 1.2",
    })
    public void sqrtTest(double a, double expectedResult) {
        double result = calculator.sqrt(a);
        assertEquals(expectedResult, result, "Invalid result of sqrt action");
    }

    @DisplayName("Should return NaN if the argument is negative")
    @Test
    public void sqrtOfNegativeNumberTest() {
        double result = calculator.sqrt(-25);
        assertEquals(NaN, result,  "Invalid result of sqrt action");
    }


}
