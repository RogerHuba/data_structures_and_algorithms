from .queue import Queue
from .node import Node


class BST(object):
    """."""
    def __init__(self, iterable=[]):
        """."""
        self.root = None

        for val in iterable:
            self.insert(val)

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

    def pre_order(self, operation):
        """Looks at root, left, then right."""
        def traverse(root):
            if root is None:
                return
            operation(root)
            traverse(root.left)
            traverse(root.right)
        traverse(self.root)

    def post_order(self, operation):
        """Looks left, right, then root."""
        def traverse(root):
            if root is None:
                return
            traverse(root.left)
            traverse(root.right)
            operation(root)
        traverse(self.root)

    def in_order(self, operation):
        """Look left, root, then right."""
        def traverse(root):
            if root is None:
                return
            traverse(root.left)
            operation(root)
            traverse(root.right)
        traverse(self.root)

    def insert(self, val):
        """."""
        new_node = Node(val)
        if self.root is None:
            self.root = new_node
            return
        current = self.root
        while current:
            if val < current.val:
                if current.left:
                    current = current.left
                else:
                    current.left = new_node
                    break
            else:
                if current.right:
                    current = current.right
                else:
                    current.right = new_node
                    break

    def find_maximum_value(self):
        """."""
        if self.root is None:
            return
        max = self.root.val

        def operation(node):
            nonlocal max
            if node.val > max:
                max = node.val
        self.in_order(operation)
        return max


def breadth_first(self, node):
    """Return values of breadth first search."""
    if self.root is None:
        return
    else:
        print(self.head),
        breadth_queue = Queue()
        breadth_queue(self.root)
    while breadth_queue is not None:
        current = breadth_queue.dequeue()
        if current.left:
            breadth_queue.queue.enqueue(current.left)
        if current.right:
            breadth_queue.queue.enqueue(current.right)
        print(current),
    return


def fizz_buzz(tree):
    """."""
    def fizz_buzz_operation(node):
        """."""
        val = ''
        if node.val % 3 == 0:
            val += 'Fizz'
        if node.val % 5 == 0:
            val += 'Buzz'
        node.val = val or node.val
    tree.in_order(fizz_buzz_operation)
    return tree
