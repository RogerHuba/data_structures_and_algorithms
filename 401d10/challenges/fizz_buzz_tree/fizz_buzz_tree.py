from .. import bst


def fizz_buzz_tree(tree):
    """Takes a tree and changes out values if conditions are met."""
    def fizz_buzz(node):
        """."""
        if node.value is not int:
            return
        elif node.value % 3 == 0 and node.value % 5 == 0:
            node.value = 'fizzbuzz'
            return
        elif node.value % 3 == 0:
            node.vale = 'fizz'
            return
        elif node.value % 5 == 0:
            node.value = 'buzz'
            return
    tree.in_order()
    return tree


if __name__ == "__main__":
    fizz_buzz_tree([10, 18, 5, 2, 1, 15, 21])
