package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class DivDoubleTest extends TestBase {

    @DisplayName("Should calculate the correct division result with double type number")
    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, div = {2}")
    @CsvSource({
            "100, 5, 20",
            "7, 3.5, 2",
            "15, 50, 0.3",
            "40, 10, 4",
            "0, 16, 0",
            "10, -2, -5",
            "-12, 2, -6",
            "15000, 3, 5000"
    })
    public void divisionDoubleTest(double a, double b, double expectedResult) {
        double result = calculator.div(a, b);
        assertEquals(expectedResult, result, "Invalid result of double division");
    }

    @DisplayName("Should return correct result with two numbers that not divide completely")
    @Test
    public void divisionNotCompletelyTest() {
        assertEquals(2.5, calculator.div(5d, 2d));
    }

    @DisplayName("Should throw NumberFormatException when divider is zero")
    @Test
    public void divisionByZeroTest() {
        Throwable exception = assertThrows(NumberFormatException.class,
                () -> {
                    calculator.div(5, 0);
                });
    }


}
