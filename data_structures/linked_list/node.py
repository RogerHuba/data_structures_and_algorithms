class Node(object):
    """ Class Node."""
    def __init__(self, val, _next=None):
        """Function for more technical information."""
        self.val = val
        self._next = _next

    def __str__(self):
        """Function for user facing data."""
        output = f'{ self.val }'
        return output
