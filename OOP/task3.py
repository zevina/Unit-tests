import unittest


class UserAccount:
    def __init__(self, username, password):
        self.username = username
        self.password = password
        self.is_logged_in = False

    def login(self, entered_password):
        if entered_password == self.password:
            self.is_logged_in = True
            return True
        else:
            return False

    def logout(self):
        self.is_logged_in = False


class TestUserAccount(unittest.TestCase):
    def setUp(self):
        self.user = UserAccount("user123", "password123")

    def test_login_success(self):
        result = self.user.login("password123")
        self.assertTrue(result)
        self.assertTrue(self.user.is_logged_in)

    def test_login_failure(self):
        result = self.user.login("wrong_password")
        self.assertFalse(result)
        self.assertFalse(self.user.is_logged_in)

    def test_logout(self):
        self.user.is_logged_in = True
        self.user.logout()
        self.assertFalse(self.user.is_logged_in)


if __name__ == '__main__':
    unittest.main()
