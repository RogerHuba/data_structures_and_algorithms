from .bst import BST
from .node import Node
from .bst import breadth_first
from .bst import find_maximum_value
import pytest


@pytest.fixture
def empty_tree():
    return BST()


@pytest.fixture
def small_tree():
    tree = BST()
    tree.insert(4)
    tree.insert(2)
    tree.insert(1)
    tree.insert(6)
    tree.insert(8)
    return tree


@pytest.fixture
def large_tree():
    tree = BST()
    tree.insert(5)
    tree.insert(4)
    tree.insert(3)
    tree.insert(2)
    tree.insert(1)
    tree.insert(6)
    tree.insert(8)
    tree.insert(10)
    tree.insert(12)
    return tree


def test_Node_exists():
    """Test that the Node class exists."""
    assert Node


def test_BST_exists():
    """Test that the BST class exists."""
    assert BST


def test_empty_tree():
    """Test that a tree does not exist."""
    tree = BST()
    assert tree.root is None


def test_insert_root():
    """Test inserting a root value."""
    tree = BST()
    tree.insert(5)
    assert tree.root.val == 5


def test_root_only_left_right_empty():
    """When there is a root test that the left child is empty."""
    tree = BST()
    tree.insert(5)
    assert tree.root.left is None
    assert tree.root.right is None


def test_root_only_left_empty():
    """When there is a root test that the left child is empty."""
    tree = BST()
    tree.insert(5)
    assert tree.root.left is None


def test_insert_left_child():
    """Test inserting a left child to root."""
    tree = BST()
    tree.insert(5)
    tree.insert(4)
    assert tree.root.left == 4


def test_insert_right_child():
    """Test inserting a right child.."""
    tree = BST()
    tree.insert(5)
    tree.insert(4)
    tree.insert(6)
    assert tree.root.right == 6


def test_insert_left_and_right_child():
    """Test inserting a left and right child."""
    tree = BST()
    tree.insert(5)
    tree.insert(4)
    tree.insert(6)
    assert tree.root.left == 4
    assert tree.root.right == 6
    display_tree()


def xtest_insert_left_left_child():
    """Test inserting a left parent and a left shild."""
    tree = BST()
    tree.insert_node(small_tree)
    assert tree.head == 5


def xtest_insert_right_left_child():
    """Testing insert a right parent then left child."""
    pass


def xtest_insert_tree():
    """Test inserting a left-right parent and each a left-right child."""
    pass


def xtest_pre_order():
    """Test a pre-order tree output."""
    pass


def xtest_in_order():
    """Test an in-order tree output."""
    pass


# Breadth First Search


def xtest_post_order():
    """Test a post order tree output."""
    pass


def xtest_breadth_first_small():
    """ Test small tree """
    pass


def xtest_bredth_first_large():
    """."""
    pass


# Find_Maximum_Value


def xtest_find_max_value_exists():
    """Test that we can get to the max_value function."""
    assert find_maximum_value


def xtest_max_value_small():
    """Test to find the max value with a small tree."""
    pass


def xtest_max_value_large():
    """Test to find the max value with a large tree."""
    pass


def xtest_max_value_with_empty_tree():
    """Test to find the max value function returns nothing on an empty tree."""
    pass
