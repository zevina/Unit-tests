import pytest

from src.list_comparer import ListComparer


@pytest.fixture(name="list_comparer1")
def setup_list_comparer1():
    """
    Set up the `list_comparer1` fixture.
    """
    list1 = [11, 22, 33, 44, 55]
    list2 = [10, 20, 30, 40, 50]
    return ListComparer(list1, list2)


@pytest.fixture(name="list_comparer2")
def setup_list_comparer2():
    """
    Set up the `list_comparer2` fixture.
    """
    list1 = [1, 2, 3, 4, 5]
    list2 = [10, 20, 30, 40, 50]
    return ListComparer(list1, list2)


@pytest.fixture(name="list_comparer3")
def setup_list_comparer3():
    """
    Set up the `list_comparer3` fixture.
    """
    list1 = [1, 2, 3, 4, 5]
    list2 = [5, 4, 3, 2, 1]
    return ListComparer(list1, list2)


def test_calc_avg(list_comparer1):
    """
    Test the calc_average method of the ListComparer class.
    """
    assert list_comparer1.calc_average([10, 20, 30, 40, 50]) == 30


def test_compare_avgs_1(list_comparer1):
    """
    Test the compare_averages method of the ListComparer class.
    """
    assert list_comparer1.compare_averages() == "Первый список имеет большее среднее значение"


def test_compare_avgs_2(list_comparer2):
    """
    Test the compare_averages method of the ListComparer class.
    """
    assert list_comparer2.compare_averages() == "Второй список имеет большее среднее значение"


def test_compare_avgs_3(list_comparer3):
    """
    Test the compare_averages method of the ListComparer class.
    """
    assert list_comparer3.compare_averages() == "Средние значения равны"
