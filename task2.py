import unittest


def add(x, y):
    return x + y


class TestAddition(unittest.TestCase):

    def test_positive_numbers(self):
        result = add(3, 5)
        self.assertEqual(result, 8)

    def test_negative_numbers(self):
        result = add(-2, -7)
        self.assertEqual(result, -9)


if __name__ == '__main__':
    unittest.main()
