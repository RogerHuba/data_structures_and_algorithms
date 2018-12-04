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

    def insert_at_end(self, value):
        """Function will add a new node with given value at the/
        end of the list"""
        if self.head is None:
            self.insert(value)
        else:
            current = self.head
            while current is not None:
                if current._next is not None:
                    current._next = Node(value)
                    self._size += 1
                    break
                current = current._next
                self._size += 1

    def insert_before_value(self, value, add_value):
        """Function will add a new node before a given value."""
        current = self.head
        previous = None
        while current:
            if current.val == value:
                if previous is None:
                    self.insert(add_value)
                else:
                    new_node = Node(add_value)
                    new_node._next = current
                    previous._next = add_value
                    self._size += 1
                return
            previous = current
            current = current._next

    def insert_after_value(self, value, add_value):
        """Function will add a new node after a given value
        """
        current = self.head
        while current:
            if current.val == value:
                new_node = Node(add_value)
                new_node._next = current
                next._next = add_value
                self._size += 1
                break
            current = current._next

