import pytest
from .queue import Queue


@pytest.fixture
def small_queue():
    queue = Queue()
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    return queue


def test_empty_queue():
    """Test if the queue is empty"""
    queue = Queue()
    assert queue.dequeue() is None


def test_decrease_queue_len(small_queue):
    """Check that the length of the queue decreases"""
    queue = small_queue
    assert len(queue) == 3
    node = queue.dequeue()
    assert len(queue) == 2


def test_expected_value_dequeue(small_queue):
    """Test the value return is what is expected"""
    node = small_queue.dequeue()
    assert node.value == 1


def test_expected_value_enqueue():
    """Test the value return of what is expected"""
    expected_value = 3
    queue = Queue()
    q.encode(expected)
    assert queue.dequeue().value == expected_value
