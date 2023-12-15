package task1;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int calculateDiscount(int sum, int disc) {
        if (sum <= 0) {
            throw new ArithmeticException("Сумма не может быть меньше или равна 0");
        }
        if (disc > 100) {
            throw new ArithmeticException("Скидка не может быть больше 100%");
        }
        if (disc <= 0) {
            throw new ArithmeticException("Скидка не может быть меньше или равна 0");
        }
        return sum - sum * disc / 100;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}
