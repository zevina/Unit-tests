import unittest


def capitalize_string(s):
    return s.capitalize()


class TestStringMethods(unittest.TestCase):

    def test_capitalize_first_letter(self):
        result = capitalize_string("hello")
        self.assertEqual(result, "Hello")

    def test_capitalize_empty_string(self):
        result = capitalize_string("")
        self.assertEqual(result, "")


if __name__ == '__main__':
    unittest.main()
