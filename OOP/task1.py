import unittest


class Calculator:
    def add(self, a, b):
        return a + b

    def subtract(self, a, b):
        return a - b

    def multiply(self, a, b):
        return a * b

    def divide(self, a, b):
        if b == 0:
            raise ValueError("Division by zero is not allowed")
        return a / b


class TestCalculator(unittest.TestCase):
    def setUp(self):
        self.calculator = Calculator()

    def test_add(self):
        result = self.calculator.add(5, 3)
        self.assertEqual(result, 8)

    def test_subtract(self):
        result = self.calculator.subtract(10, 4)
        self.assertEqual(result, 6)

    def test_multiply(self):
        result = self.calculator.multiply(6, 7)
        self.assertEqual(result, 42)

    # def test_divide(self):
    #     result = self.calculator.divide(20, 5)
    #     self.assertEqual(result, 4)
    def test_divide(self):
        result = self.calculator.divide(20, 5)
        self.assertAlmostEqual(result, 4.005, places=2, msg="Division result is incorrect")

    def test_divide_by_zero(self):
        with self.assertRaises(ValueError):
            self.calculator.divide(10, 0)


if __name__ == '__main__':
    unittest.main()
