from .bst import BST
from .node import Node
from .bst import fizz_buzz
from .bst import breadth_first
import pytest


@pytest.fixture
def small_tree():
    """Fixture to insert a small tree."""
    tree = BST()
    tree.insert(10)
    tree.insert(5)
    tree.insert(3)
    tree.insert(15)
    return BST


def test_Node_exists():
    """Test that the Node class exists."""
    assert Node


def test_BST_exists():
    """Test that the BST class exists."""
    assert BST


def test_BST_instance():
    """."""
    assert BST()


def test_empty_tree():
    """Test that a tree does not exist."""
    tree = BST()
    assert tree.root is None


def test_insert_root():
    """Test inserting a root value."""
    tree = BST()
    tree.insert(5)
    assert tree.root.val == 5


def test_root_left_empty():
    """When there is a root test that the left child is empty."""
    tree = BST()
    tree.insert(5)
    assert tree.root.left is None


def test_root_right_empty():
    """When there is a root test that the left child is empty."""
    tree = BST()
    tree.insert(5)
    assert tree.root.right is None


def test_insert_root_left_right():
    """."""
    tree = BST([10, 5, 15])
    assert tree.root.val == 10
    assert tree.root.left.val == 5
    assert tree.root.right.val == 15


def test_insert_root_child_grandchildren():
    """."""
    tree = BST([10, 5, 15, 4, 18])
    assert tree.root.val == 10
    assert tree.root.left.val == 5
    assert tree.root.right.val == 15
    assert tree.root.left.left.val == 4
    assert tree.root.right.right.val == 18


def test_construct_with_iterable():
    """."""
    tree = BST([10, 5, 3, 15])
    assert tree.root.val == 10
    assert tree.root.left.val == 5
    assert tree.root.right.val == 15
    assert tree.root.left.left.val == 3


def test_in_order():
    """."""
    tree = BST([10, 5, 3, 15])
    report = ''

    def operation(node):
        nonlocal report
        report += str(node.val) + ','
    tree.in_order(operation)
    assert report == '3,5,10,15,'


def test_pre_in_order():
    """."""
    tree = BST([10, 5, 3, 15])
    report = ''

    def operation(node):
        nonlocal report
        report += str(node.val) + ','
    tree.pre_order(operation)
    assert report == '10,5,3,15,'


def test_post_in_order():
    """."""
    tree = BST([10, 5, 3, 15])
    report = ''

    def operation(node):
        nonlocal report
        report += str(node.val) + ','
    tree.post_order(operation)
    assert report == '3,5,15,10,'


def test_is_fizz_buzz():
    """."""
    assert fizz_buzz


def test_fizz_buzz():
    """."""
    tree = BST([9, 5, 15, 7])
    tree = fizz_buzz(tree)
    assert tree.root.val == 'Fizz'
    assert tree.root.left.val == 'Buzz'
    assert tree.root.right.val == 'FizzBuzz'
    assert tree.root.left.right.val == 7


def test_find_maximum_value_root_none():
    """Test to find the max value with a small tree."""
    tree = BST([0])
    assert tree.find_maximum_value() == 0


def test_find_maximum_value():
    """Test to find the max value with a small tree."""
    tree = BST([9, 5, 15, 7])
    assert tree.find_maximum_value() == 15


def test_find_maximum_value_negative():
    """Test to find the max value with a small tree."""
    tree = BST([-9, -5, -15, -7])
    assert tree.find_maximum_value() == -9
