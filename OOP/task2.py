import unittest


class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def greet(self):
        return f"Hello, my name is {self.name} and I am {self.age} years old."


class TestPerson(unittest.TestCase):
    def setUp(self):
        self.person = Person("Alice", 30)

    def test_greet(self):
        result = self.person.greet()
        self.assertEqual(result, "Hello, my name is Alice and I am 30 years old.", "Greet message is incorrect")

    def test_name(self):
        self.assertEqual(self.person.name, "Alice", "Name is incorrect")

    def test_age(self):
        self.assertEqual(self.person.age, 30, "Age is incorrect")

    def test_invalid_age(self):
        with self.assertRaises(ValueError):
            person = Person("Bob", -5)


if __name__ == '__main__':
    unittest.main()
