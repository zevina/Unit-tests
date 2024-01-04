import unittest


class Student:
    def __init__(self, name, age, major):
        self.name = name
        self.age = age
        self.major = major

    def get_name(self):
        return self.name

    def get_age(self):
        return self.age

    def get_major(self):
        return self.major


class TestUserAccount(unittest.TestCase):
    def setUp(self):
        self.student = Student("Lena", 30, "it")

    def test_get_name(self):
        self.assertEqual(self.student.name, "Lena", "Name is incorrect")

    def test_get_age(self):
        self.assertEqual(self.student.age, 30, "Age is incorrect")

    def test_get_major(self):
        self.assertEqual(self.student.major, "it", "Major is incorrect")


if __name__ == '__main__':
    unittest.main()
