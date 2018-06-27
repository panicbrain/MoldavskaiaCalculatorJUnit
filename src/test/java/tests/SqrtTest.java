package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
    public void sqrtTest(double a, double expectedResult){
        double result = calculator.sqrt(a);
        assertEquals(result, expectedResult, "Invalid result of sqrt action");
    }

  @Test
    public void sqrtOfNegativeNumberTest(){
      Throwable exception = assertThrows(Exception.class,
              () -> {
                  calculator.sqrt(-25);
              });
    }


}
