from .array_shift import insert_shift_array

def test_even_list():
    """test function which tests by bringing in an even numbered list
    """
    actual = [1, 2, 3, 4]
    other_value = 6
    expected = [1, 2, 6, 3, 4]
    assert insert_shift_array(actual, other_value) == expected

def test_odd_list():
    """test function which tests by bringing in an off numberedlist
    """
    actual = [1, 2, 3, 4, 5]
    other_value = 6
    expected = [1, 2, 3, 6, 4, 5]
    assert insert_shift_array(actual, other_value) == expected

def test_same_number_list():
    """test function which tests by bringing in a list with the same numbers in the list
    """
    actual = [1, 1, 1, 1, 1]
    other_value = 6
    expected = [1, 1, 1, 6, 1, 1]
    assert insert_shift_array(actual, other_value) == expected
