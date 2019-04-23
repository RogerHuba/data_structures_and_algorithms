"""Creates a node."""


class Node(object):
    """Creates Node."""

    def __init__(self, val, left=None, right=None):
        """."""
        self.left = None
        self.right = None
        self.val = val

    def __repr__(self):
        """."""
        return f'<Node: value={self.val}, left={self.left}, right={self.right})>'

    def __str__(self):
        """."""
        return self.val
