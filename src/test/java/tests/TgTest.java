package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TgTest extends TestBase {

    @DisplayName("Should calculate the correct result of tg function")
    @ParameterizedTest(name = "{index} => a = {0}, tg = {1}")
    @CsvSource({
            "1, 0.17",
            "40, 0.839",
            "-1.44, 1.2",
            "0, 0"
    })
    public void tgTest(double a, double expectedResult){
        double result = calculator.tg(a);
        assertEquals(expectedResult, result, "Invalid result of tg function");
    }
}
