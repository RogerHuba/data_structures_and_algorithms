from .radixsort import radixsort
import pytest
import random


def test_module_exists():
    """Function to check that quicksort exists."""
    assert radixsort


def test_sort_empty_list():
    """Function to test an empty list."""
    assert radixsort([]) == []


def test_sort_single_items_list():
    """Function to test a single item list."""
    random_list = create_random_list(0)
    assert radixsort(random_list) == sorted(random_list)


def test_sort_even_numbered_list():
    """Function to test an even numbered list."""
    random_list = create_random_list(5)
    assert radixsort(random_list) == sorted(random_list)


def test_sort_odd_numbered_list():
    """Function to test an odd numbered list."""
    random_list = create_random_list(4)
    assert radixsort(random_list) == sorted(random_list)


def create_random_list(number_in_list):
    """Function to generate a random list."""
    return [(random.randint(1, 1000)) for _ in range(number_in_list)]
