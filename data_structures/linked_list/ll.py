from .node import Node


class LinkedList(object):
    """Linked list object."""

    def __init__(self, iterable=None):
        """
        """
        self.head = None
        self._size = 0

        if iterable is None:
            iterable = []

        if type(iterable) is not list:
            raise TypeError('iterable must be of type list')

        for val in iterable:
            self.insert(val)

    def __str__(self):
        """Generated Function for user facing data."""
        output = f'Linked List: Head val - { self.head }'
        return output

    def __repr__(self):
        """Function for technical data."""
        output = f'<LinkedList: head - { self.head } size - { self._size }>'
        return output

    def __len__(self):
        """Function to return length"""
        return self._size

    def insert(self, value):
        """Function for node inserting"""
        node = Node(value)
        node._next = self.head
        self.head = node
        # self.head = Node(value, self.head)
        self._size += 1

    def includes(self, value):
        """Function to return if an int is in the linked list."""
        current = self.head
        while current is not None:
            if current.val == value:
                return True
            else:
                current = current._next
        return False
