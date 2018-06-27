package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class SinusTest extends TestBase {

    @DisplayName("Should calculate the correct result of sin function")
    @ParameterizedTest(name = "{index} => a = {0}, sin = {1}")
    @CsvSource({
            "0, 0",
            "1, 0.8415",
            "4, -0.7568",
            "-1.44, -0.9915",
    })
    public void SinTest(double a, double expectedResult) {
        double result = calculator.sin(a);
        assertTrue((expectedResult - result) < 0.0001, "Invalid result of sin function");
    }
}
