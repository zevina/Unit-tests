class ListComparer:
    """
    A class that compares the average values of 2 lists.
    """

    def __init__(self, list1, list2):
        """
        Initializes a new instance of the class.
        Args:
            list1 (list): The first list.
            list2 (list): The second list.
        """
        self.list1 = list1
        self.list2 = list2

    def calc_average(self, user_list):
        """
        Calculates the average of a list of numbers.
        Parameters:
            user_list (list): A list of numbers.
        Returns:
            float: The average of the numbers in the list.
        """
        return sum(user_list) / len(user_list)

    def compare_averages(self):
        """
        Compare the average values of 2 lists and return a string: which list has a higher average.
        Parameters:
            self (object): The object instance.
        Returns:
            str: A string indicating which list has a higher average.
        """
        avg1 = self.calc_average(self.list1)
        avg2 = self.calc_average(self.list2)

        if avg1 > avg2:
            return "Первый список имеет большее среднее значение"
        if avg2 > avg1:
            return "Второй список имеет большее среднее значение"
        return "Средние значения равны"
