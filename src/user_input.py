def get_user_input_list():
    """
    Retrieves a list of numbers from the user input.
    Returns:
        list: numbers from the user. If is empty or not a valid number, return an empty list.
    """
    user_input = input("Введите список чисел через пробел: ")
    if user_input == "":
        print("Вы ничего не ввели!")
    numbers = user_input.split()
    try:
        numbers = [float(num) for num in numbers]
        return numbers
    except ValueError:
        print("Неверный формат!")
        return []
