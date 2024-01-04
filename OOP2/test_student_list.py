import unittest
from student import Student
from student_list import StudentList


class Test_Student_list(unittest.TestCase):

    def setUp(self):
        self.student_list = StudentList()
        self.student1 = Student("Lena", 30, "it")
        self.student2 = Student("Misha", 32, "math")
        self.student3 = Student("Max", 28, "chemic")

    def test_add_student(self):
        self.student_list.add_student(self.student1)
        self.assertIn(self.student1, self.student_list.students, "Not found")

    def test_remove_student(self):
        self.student_list.add_student(self.student2)
        self.assertIn(self.student2, self.student_list.students, "Not found")
        self.student_list.remove_student(self.student2)
        self.assertNotIn(self.student2, self.student_list.students, "Not found")

    def test_get_student_names(self):
        self.student_list.add_student(self.student1)
        self.student_list.add_student(self.student2)
        self.student_list.add_student(self.student3)
        self.names = ["Lena", "Misha", "Max"]
        self.assertEqual(self.names, self.student_list.get_student_names(), "Names is incorrect")


