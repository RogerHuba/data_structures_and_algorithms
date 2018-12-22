""" 
A Python program to demonstrate the adjacency
list representation of the graph
"""


class AdjNode:
    """."""

    def __init__(self, data):
        """."""
        self.vertex = data
        self.next = None

# A class to represent a graph. A graph
# is the list of the adjacency lists.
# Size of the array will be the no. of the
# vertices "V"


class Graph:
    """."""

    def __init__(self, vertices):
        """."""
        self.verticies = vertices
        self.graph = [None] * self.verticies

    # Function to add an edge in an undirected graph
    def add_edge(self, v1, v2, weight=None):
        """."""
        # Adding the node to the source node
        node = AdjNode(v2)
        node.next = self.graph[v1]
        self.graph[v1] = node

        # Adding the source node to the destination as
        # it is the undirected graph
        node = AdjNode(v1)
        node.next = self.graph[v2]
        self.graph[v2] = node

    # Function to print the graph
    def print_graph(self):
        """."""
        for i in range(self.verticies):
            print("Adjacency list of vertex {}\n head".format(i), end="")
            temp = self.graph[i]
            while temp:
                print(" -> {}".format(temp.vertex), end="")
                temp = temp.next
            print(" \n")


# Driver program to the above graph class
if __name__ == "__main__":
    verticies = 5
    graph = Graph(verticies)
    graph.add_edge(0, 1)
    graph.add_edge(0, 4)
    graph.add_edge(1, 2)
    graph.add_edge(1, 3)
    graph.add_edge(1, 4)
    graph.add_edge(2, 3)
    graph.add_edge(3, 4)

    graph.print_graph()
