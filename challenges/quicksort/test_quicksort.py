from .quicksort import quicksort
import pytest
import random


def test_module_exists():
    """Function to check that quicksort exists."""
    assert quicksort


def test_sort_empty_list():
    """Function to test an empty list."""
    assert quicksort([]) == []


def test_sort_single_items_list():
    """Function to test a single item list."""
    random_list = create_random_list(0)
    assert quicksort(random_list) == sorted(random_list)


def test_sort_even_numbered_list():
    """Function to test an even numbered list."""
    random_list = create_random_list(5)
    assert quicksort(random_list) == sorted(random_list)


def test_sort_odd_numbered_list():
    """Function to test an odd numbered list."""
    random_list = create_random_list(4)
    assert quicksort(random_list) == sorted(random_list)


def create_random_list(number_in_list):
    """Function to generate a random list."""
    return [(random.randint(1, 21) * 5) for _ in range(number_in_list)]
