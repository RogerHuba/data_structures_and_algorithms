from .ll import LinkedList
import pytest


@pytest.fixture
def empty_ll():
    """Empty fixture for testing."""
    return LinkedList()


@pytest.fixture
def small_ll():
    """Testing Data."""
    ll = LinkedList()
    ll.insert(1)
    ll.insert(2)
    ll.insert(3)
    ll.insert(4)
    return ll


@pytest.fixture
def random_ll():
    """Additional testing data."""
    from random import randint
    ll = LinkedList()
    for num in range(100):
        ll.insert(randint(0, 100))
    return ll


def test_ll_module_exists():
    """Test function to verify that a module exists."""
    assert LinkedList


def test_ll_instance_has_none_value_head(empty_ll):
    """Test function to validate no head value."""
    assert empty_ll.head is None


def test_ll_str_method(empty_ll):
    """Test function to test str."""
    assert str(empty_ll) == f'Linked List: Head val - { empty_ll.head }'


def test_size_of_empty_ll(empty_ll):
    """Test function on empty link list."""
    assert len(empty_ll) == 0


def test_small_fixture_has_size_of_4(small_ll):
    """Testing Function on size using len command."""
    assert len(small_ll) == 4


def test_insert_new_node_into_empty_list(empty_ll):
    """Test function for a new node."""
    assert empty_ll.head is None
    empty_ll.insert(1)
    assert empty_ll.head.val == 1


def test_random_ll(random_ll):
    """Function to test a random length."""
    assert len(random_ll) == 100


def test_iterable_as_argument():
    """Test function on iterable."""
    ll = LinkedList([1, 2, 3, 4])
    assert ll.head.val == 4
    assert len(ll) == 4


def test_is_value_in_linked_list():
    """Test function on a value in a linked list."""
    ll = LinkedList([1, 2, 3, 4])
    assert ll.includes(4) is True


def test_value_is_not_in_linked_list():
    """Test function to validate a value not in linked list."""
    ll = LinkedList([1, 2, 3, 4])
    assert ll.includes(6) is False


def test_k_from_end_expected():
    """Test that will verify the expected output"""
    ll = LinkedList([1, 2, 3, 4, 5])
    assert ll.k_from_end(2) == 3


def test_k_from_end_not_there():
    """Test will check if value larger than linked list"""
    ll = LinkedList([1, 2, 3, 4, 5])
    with pytest.raises(ValueError):
        ll.k_from_end(5)


def test_k_from_end_node_empty():
    """Test will check if value larger than linked list"""
    ll = LinkedList([1, 2, 3, 4, 5])
    with pytest.raises(ValueError) as ve:
        ll.k_from_end(5)
    assert '5 exceeds node length' in str(ve.value)


# def test_merge_expected():
#     """Test the merge function returns an expected value"""
#     ll1, ll2 = LinkedList([1, 3, 5]), LinkedList([2, 4, 6])
#     assert ll1.merged_list(ll1, ll2) == 1#[1, 2, 3, 4, 5, 6]
#     pass


# def test_merge_list1_bigger():
#     ll1, ll2 = LinkedList([1, 3, 5, 7]), LinkedList([2, 4, 6])
#     assert ll1.merged_list(ll1, ll2) == 1#[1, 2, 3, 4, 5, 6, 7]
#     pass


# def test_merge_list2_bigger():
#     ll1, ll2 = LinkedList([1, 3, 5]), LinkedList([2, 4, 6, 8])
#     assert ll1.merged_list(ll1, ll2) == 1#[1, 2, 3, 4, 5, 6, 8]
#     pass
