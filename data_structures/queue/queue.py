from .node import Node

class Queue(object):
    """Creates queue object"""

    def _init__(self, _iterable=None):
        """Creates a Queue"""
        self.front = None
        self.back = None
        self._size = 0

        if _iterable:
            if type(_iterable) is list:
                for value in _iterable:
                    self.eneueue(value)
            else:
                raise TypeError('Iterable must be a list type.')

    def __repr__(self):
        """
        """
        return f'<Queue Object: length = : { self.top }>'

    def __len__(self):
        """
        """
        return self._size

    def enqueue(self, value):
        """Add node to the back of queue"""
        if value is None:
            raise ValueError('Node value cannot be none')
            return
            node = Node(value)
            node._next = self.back
            self.back = node
            self._size += 1
            if self._size == 1:
                self.front = node
            return node

    def dequeue(self):
        """remove node from front of queue"""
        if self.front is None:
            raise ValueError('Cannot dequeue from empty queue')

        node = self.front
        if self.front:
            self.front = self.front._next
            self._size -= 1
        return node

    def peek(self):
        """Gets front of Queue"""
        return self.front
