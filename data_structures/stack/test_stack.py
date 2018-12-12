import pytest
from .stack import Stack


@pytest.fixture
def small_stackß():
    stack = ç()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    return stack


def test_empty_stack():
    """Test if the stack is empty"""
    stack = Stack()
    assert stack.top() is None


def test_create_stack:
    """
    """
    stack = Stack()
    assert stack.top is None;


def test_push_stack:
    """
    """ß

def test_pop_stack:
    """
    """
