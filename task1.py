import unittest


def divide(x, y):
    if y == 0:
        raise ValueError("Cannot divide by zero")
    return x / y


class TestDivision(unittest.TestCase):

    def test_positive_numbers(self):
        result = divide(10, 2)
        self.assertEqual(result, 5)

    def test_divide_by_zero(self):
        with self.assertRaises(ValueError):
            divide(8, 0)


if __name__ == '__main__':
    unittest.main()
