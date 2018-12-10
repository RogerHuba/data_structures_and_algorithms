class Node(object):
    """
    """

    def __init__(self, value, next_node=None):
        """
        """
        self.value = value
        self.next_node = next_node

    def __str__(self):
        """
        """

        return f'{ self.value }'

    def __repr__(self):
        """
        """
        return f'{ self.value }'
