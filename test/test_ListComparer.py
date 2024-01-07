from src.list_comparer import ListComparer
import pytest


@pytest.fixture
def list_comparer1():
    list1 = [11, 22, 33, 44, 55]
    list2 = [10, 20, 30, 40, 50]
    return ListComparer(list1, list2)


@pytest.fixture
def list_comparer2():
    list1 = [1, 2, 3, 4, 5]
    list2 = [10, 20, 30, 40, 50]
    return ListComparer(list1, list2)


@pytest.fixture
def list_comparer3():
    list1 = [1, 2, 3, 4, 5]
    list2 = [5, 4, 3, 2, 1]
    return ListComparer(list1, list2)


def test_calc_avg(list_comparer1):
    assert list_comparer1.calc_average([10, 20, 30, 40, 50]) == 30


def test_compare_avgs1(list_comparer1):
    assert list_comparer1.compare_averages() == "Первый список имеет большее среднее значение"


def test_compare_avgs2(list_comparer2):
    assert list_comparer2.compare_averages() == "Второй список имеет большее среднее значение"


def test_compare_avgs3(list_comparer3):
    assert list_comparer3.compare_averages() == "Средние значения равны"
