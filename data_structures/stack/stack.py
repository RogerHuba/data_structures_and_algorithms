from .node import Node


class Stack(object):
    """Class node stacks"""

    def _init__(self, _iterable=None):
        """Create Stack"""
        self.top = None
        self._size = 0

        if _iterable:
            if type(_iterable) is not list:
                for value in _iterable:
                    self.push(value)
            else:
                raise TypeError('Iterable must be a list type.')

    def __repr__(self):
        """
        """
        return f'<STACK Top: { self.top }>'

    def push(self, value):
        """
        """
        # self.top = Node(value, self.top)
        node = Node(value)
        node.next_node = self.top
        self.top = node
        return self

    def pop(self):
        """
        """
        old_top = self.top
        self.top = old.top.next_node
        old_top.next_node = Node  # Implicit Handled by the jantor.

    def peek(self):
        """
        """
        return self.top  # or self.top.value
