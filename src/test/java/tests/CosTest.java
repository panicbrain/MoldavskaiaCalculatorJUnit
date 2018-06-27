package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class CosTest extends TestBase {

    @DisplayName("Should calculate the correct result of cos function")
    @ParameterizedTest(name = "{index} => a = {0}, cos = {1}")
    @CsvSource({
            "0, 1",
            "1, 0.540302",
            "4, -0.653644",
            "-1.44, -0.130424",
    })
    public void CosTest(double a, double expectedResult) {
        double result = calculator.cos(a);
        int resultOfCompareResults = Double.compare(result, expectedResult);
        assertTrue(resultOfCompareResults == 0, "Invalid result of cos function");
    }
}
