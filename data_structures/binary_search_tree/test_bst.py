from .bst import BST
from .bst import Node
import pytest

@pytest.fixture
def empty_BST():
    return BST()


def test_Node_exists():
    """Test that the Node class exists."""
    assert Node


def test_BST_exists():
    """Test that the BST class exists."""
    assert BST


def test_empty_tree():
    """Test that a tree does not exist."""
    pass


def test_insert_root():
    """Test inserting a root value."""
    pass


def test_insert_left_child():
    """Test inserting a left child to root."""
    pass


def test_insert_right_child():
    """Test inserting a right child.."""
    pass


def test_insert_left_and_right_child():
    """Test inserting a left and right child."""
    pass


def test_insert_left_left_child():
    """Test inserting a left parent and a left shild."""
    pass


def test_insert_right_left_child():
    """Testing insert a right parent then left child."""
    pass


def test_insert_tree():
    """Test inserting a left-right parent and each a left-right child."""
    pass


def test_pre_order():
    """Test a pre-order tree output."""
    pass


def test_in_order():
    """Test an in-order tree output."""
    pass


def test_post_order():
    """Test a post order tree output."""
    pass
