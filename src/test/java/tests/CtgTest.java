package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.lang.Double.POSITIVE_INFINITY;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CtgTest extends TestBase {

    @DisplayName("Should calculate the correct result of ctg function")
    @ParameterizedTest(name = "{index} => a = {0}, ctg = {1}")
    @CsvSource({
            "1, 0.642093",
            "4, 0.863691",
            "-1.44, -7.601826",
    })
    public void ctgTest(double a, double expectedResult) {
        double result = calculator.ctg(a);
        int resultOfCompareResults = Double.compare(result, expectedResult);
        assertTrue(resultOfCompareResults == 0, "Invalid result of ctg function");
      }

    @DisplayName("Should return POSITIVE_INFINITY when argument is zero")
    @Test
    public void ctgOfZeroTest() {
        assertEquals(POSITIVE_INFINITY, calculator.ctg(0), "Invalid ctg function of zero");
    }

    //http://old.exponenta.ru/educat/class/test/hyperb/13.asp - table for tanh


}
