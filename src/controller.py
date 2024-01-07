from user_input import get_user_input_list
from list_comparer import ListComparer


def controller():
    """
    A function that acts as a controller for the program.
    It takes no parameters.
    Finally, the result is printed to the console.
    This function doesn't return any value.
    """
    list1 = get_user_input_list()
    list2 = get_user_input_list()

    if not list1 or not list2:
        return

    result = ListComparer(list1, list2).compare_averages()
    print(result)
