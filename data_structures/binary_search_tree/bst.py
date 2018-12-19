from queue import Queue
from .node import Node


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


def find_maximum_value(self, node):
    """Traverse tree and get value of the largest node."""
    if self.root is None:
        return
    else:
        print(self.head),
        max_queue = Queue()
        max_queue(self.root)
        max_value = 0

    while max_queue is not None:
        current = max_queue.dequeue()
        if current > max_value:
            max_value = current
        if current.left:
            max_queue.queue.enqueue(current.left)
        if current.right:
            max_queue.queue.enqueue(current.right)
        print(current),
    return max_value
