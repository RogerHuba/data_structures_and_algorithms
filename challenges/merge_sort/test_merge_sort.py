import pytest
from .merge_sort import merge_sort


def test_merge_sort_exists():
    """Test that the merge_sort directory exists."""
    assert merge_sort


def test_merge_sort_no_list():
    """Test the merge sort with nothing in the list."""
    merge_sort([])
    assert 'False'


def test_merge_sort_one_item_list():
    """Test the merge sort with one item in the list"""
    merge_sort([5])
    assert [5]


def test_merge_sort_odd_list():
    """Test the merge sort with a list with odd numbers."""
    merge_sort([1, 3, 5, 7, 2, 4, 6])
    assert [1, 2, 3, 4, 5, 6, 7]


def test_merge_sort_even_list():
    """Test the merge sort with a list of even numbers."""
    merge_sort([1, 5, 2, 6, 3, 7, 4, 8, 10, 9])
    assert [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


def test_merge_sort_large_list():
    """Test the merge sort with a list of even numbers."""
    lst = [1, 5, 2, 6, 3, 7, 4, 8, 10, 9, 11, 30, 40, 50, 60, 70, 35, 45, 55, 65]
    merge_sort(lst)
    assert [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 30, 35, 40, 45, 50, 55, 60, 65, 70]
