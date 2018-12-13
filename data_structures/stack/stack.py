from .node import Node


class Stack(object):
    """Class node stacks"""

    def __init__(self, iterable=None):
        """Create Stack"""
        self.top = None
        self.size = 0

        if iterable is None:
            iterable = []

        if type(iterable) is not list:
            raise TypeError('Iterable must be list type.')

        for value in iterable:
            self.push(value)

    def __repr__(self):
        """"""
        return f'<STACK Top: { self.top }>'

    def __str__(self):
        """"""
        return f'<Stack Top: {self.top}>'

    def __len__(self):
        return self.size

    def push(self, value):
        """"""
        Node.next = self.top
        self.top = Node
        self.size += 1
        return self.top

    def pop(self):
        """"""
        if peek(self) is true: #change to raise exception
            temp = self.top
            self.top = self.top.next
            temp.next = None
            self.size -= 1
        return temp

    def peek(self):
        """"""
        return self.top
