import pytest
from .stack import Stack


@pytest.fixture
def small_stack():
    stack = Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    return stack


def test_empty_stack():
    """Test if the stack is empty"""
    stack = Stack()
    print(stack)
    assert stack.top is None


def test_empty_stack_len():
    stack = Stack()
    assert len(stack) == 0


def test_push_stack(small_stack):
    print(small_stack.peek())
    # import pdb; pdb.set_trace()
    assert small_stack.peek()


def test_peek_empty_stack():
    assert Stack().peek() is None

