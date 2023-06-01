import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lukaswais.Calculator;

public class CalculatorTest {
    @Test
    void testAdd() {
        double result = Calculator.add(2.5, 3.7);
        Assertions.assertEquals(6.2, result, 0.0001);
    }

    @Test
    void testSubtract() {
        double result = Calculator.subtract(10, 5.5);
        Assertions.assertEquals(4.5, result);
    }

    @Test
    void testMultiply() {
        double result = Calculator.multiply(2, 3);
        Assertions.assertEquals(6, result);
    }

    @Test
    void testDivide() {
        double result = Calculator.divide(10, 2);
        Assertions.assertEquals(5, result);    }

    /**
     * checks if the correct exception is thrown.
     */
    @Test
    void testDivideByZeroException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(10, 0);
        });
    }
    /**
     * checks if the correct error message is thrown
     */
    @Test
    void testDivideByZeroExceptionMessage() {
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(10, 0);
        });
        Assertions.assertEquals("Cannot divide by zero", exception.getMessage());
    }
}