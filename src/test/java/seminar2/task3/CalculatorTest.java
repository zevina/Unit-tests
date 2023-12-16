package seminar2.task3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @AfterEach
    void clean() {
        calculator = null;
    }

    @Test
    void add() {
        int result = calculator.add(5, 5);
        assertEquals(10, result, "5+5 = 10");
    }

    @Test
    void subtract() {
        int result = calculator.subtract(10, 2);
        assertEquals(8, result, "10-2 = 8");
    }

    @Test
    void multiply() {
        int result = calculator.multiply(25, 4);
        assertEquals(100, result, "25*4 = 100");
    }

    @Test
    void divide() {
        int result = calculator.divide(15, 5);
        assertEquals(3, result, "15/5 = 3");
    }

    @Test
    void divideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(15, 0), "Division by zero");
    }
}