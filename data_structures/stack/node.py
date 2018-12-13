class Node(object):
    """Class of node objects for stacks."""

    def __init__(self, value, next=None):
        """ Initialize new node with a value and pointer."""
        self.value = value
        self.next = next

    def __str__(self):
        """"""
        return f'<Node Value: { self.value }>'

    def __repr__(self):
        """"""
        return f'<Node Value: { self.value }'
