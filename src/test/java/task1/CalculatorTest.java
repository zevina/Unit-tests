package task1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void setup() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @AfterEach
    void cleanup() {
        calculator = null;
    }

    @AfterAll
    static void teardown() {
        System.out.println("After all tests");
    }

    @Test
    @DisplayName("Тест сложения положительных чисел")
    void testAdd() {
        int result = calculator.add(5, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    @DisplayName("Test subtraction")
    void testSubtract() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result, "10 - 4 should equal 6");
    }

    @Test
    @DisplayName("Test multiplication")
    void testMultiply() {
        int result = calculator.multiply(6, 7);
        assertEquals(42, result, "6 * 7 should equal 42");
    }

    @Test
    @DisplayName("Test division")
    void testDivide() {
        int result = calculator.divide(20, 5);
        assertEquals(4, result, "20 / 5 should equal 4");
    }

    @Test
    @DisplayName("Test division by zero")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Division by zero should throw ArithmeticException");
    }

    @Test
    @DisplayName("Проверка суммы с учетом скидки")
    void calculateDiscount() {
        int result = calculator.calculateDiscount(1000, 13);
        assertEquals(870, result, "amount with a 13% discount from 1000 should equal 870");
    }

    @Test
    @DisplayName("Скидка > 100%")
    void testCalculateDiscountOver() {
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(100, 200), "Скидка > 100% should throw ArithmeticException");
    }

    @Test
    @DisplayName("Скидка = 0")
    void testCalculateDiscountZero() {
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(100, 0), "Скидка = 0 should throw ArithmeticException");
    }

    @Test
    @DisplayName("Скидка < 0")
    void testCalculateDiscountBelow() {
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(100, -5), "Скидка < 0 should throw ArithmeticException");
    }

    @Test
    @DisplayName("Сумма = 0")
    void testCalculateDiscountSumZero() {
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(0, 50), "Сумма = 0 should throw ArithmeticException");
    }

    @Test
    @DisplayName("Сумма < 0")
    void testCalculateDiscountSumBelow() {
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(-5, 50), "Сумма < 0 should throw ArithmeticException");
    }
}