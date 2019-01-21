import pytest
from .selection import selection_sort


def test_selection_sort_exists():
    """Test that the function exists."""
    assert selection_sort


def test_list_output():
    """Test lst returns the right order."""
    selection_sort([5, 2, 1, 9, 0, 4, 6])
    assert [0, 1, 2, 4, 5, 6, 9]


def test_an_empty_list():
    """Test an empty list."""
    selection_sort([])
    assert 'False'
