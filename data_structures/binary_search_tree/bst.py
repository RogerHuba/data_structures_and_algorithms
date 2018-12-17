class Node(object):
    """Creates Node."""
    def __init__(self, val):
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


class BST(object):
    """."""
    def __init__(self):
        """."""
        self.root = None

    def __repr__(self):
        """."""
        return f'<Node: value={self.val}, left={self.left}, right={self.right})>'

    def __str__(self):
        """."""
        return self.root.val

    def delete_tree(self):
        """."""
        self.root = None
        return self.root

    def is_empty(self):
        """."""
        return self.root is None

    def display_tree(self):
        """."""
        if(self.root is not None):
            self._print_tree(self.root)

    def _print_tree(self, node):
        """."""
        if (node is not None):
            self._print_tree(node.left)
            print(str(node.value) + ' ')
            self._print_tree(node.right)

    def pre_order(self, node, operation):
        """Looks at root, left, then right."""
        if node is None:
            return

        operation(node)

        if node.left is not None:
            self.pre_order(node.left)
        if node.right is not None:
            self.pre_order(node.right)

    def post_order(self, node, operation):
        """Looks left, right, then root."""
        if node is None:
            return
        if node.left is not None:
            self.post_order(node.left)
        if node.right is not None:
            self.post_order(node.right)

        operation(node)

    def in_order(self, node, operation):
        """Looks left, root, then right."""
        if node is None:
            return
        if node.left is not None:
            self.in_order(node.left)

        operation(node)

        if node.right is not None:
            self.in_order(node.right)

    def insert_node(self, val, node):
        """."""
        if self.root is None:
            self.root = Node(val)

        else:
            if node.right is not None:
                self._add(val, node.right)
            else:
                node.right = Node(val)

    # def find(self, val):
    #     """."""
    #     if self.root is not None:
    #         return self._find(val, self.root)
    #     else:
    #         return None

    # def _find(self, val, node):
    #     """."""
    #     if val == node.value:
    #         return node
    #     elif val < node.value and node.left is not None:
    #         self._find(val, node.left)
    #     elif val > node.value and node.right is not None:
    #         self._find(val, node.right)


