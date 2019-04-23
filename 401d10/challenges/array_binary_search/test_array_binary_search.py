from .array_binary_search import binary_search


def test_does_function_exist():
    """A function to test to see the array_binary_search function is there."""
    assert binary_search


def test_simple_numberic_list_and_value():
    """This function will test aa numeric array and numberic value."""
    actual_lst = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    actual_val = 4
    actual = binary_search(actual_lst, actual_val)
    expected = 3
    assert actual == expected


def test_simple_alphanumeric_list_and_value():
    """This function will test as a alphanumeric list and value."""
    actual_lst = ['a', 'A', 'ace', 'Army']
    actual_val = 'a'
    actual = binary_search(actual_lst, actual_val)
    expected = 0
    assert actual == expected


def test_simple_numeric_list_and_no_value():
    """This function will test as a numeric list and a no value."""
    actual_lst = [1, 2, 3, 4, 5, 6, 7]
    actual_val = 10
    actual = binary_search(actual_lst, actual_val)
    expected = -1
    assert actual == expected


def test_empty_list_and_value():
    """This function will test an empty list with a value."""
    actual_lst = []
    actual_val = 10
    actual = binary_search(actual_lst, actual_val)
    expected = -1
    assert actual == expected


def test_numeric_list_with_multiple_values():
    """
    This function will test a numeric list with
    multiple values in list and value.
    """
    actual_lst = [1, 2, 5, 8, 3, 6, 3, 1, 2]
    actual_val = 2
    actual = binary_search(actual_lst, actual_val)
    expected = 1
    assert actual == expected

