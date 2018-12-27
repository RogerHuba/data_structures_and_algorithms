class Graph:
    """Class to create graph."""

    def __init__(self):
        """Initialization."""
        self.graph = {}

    def __repr__(self):
        """."""
        return f'Graph: {self.graph} Size: {len(self.graph)}'

    def __str__(self):
        """."""
        return  f'Graph: {self.graph}'

    def __len__(self):
        """."""
        return len(self.graph)

    def add_vert(self, val):
        """."""
        if not self.has_vert(val):
            self.graph[val] = {}
        return self

    def has_vert(self, val):
        """."""
        if val in self.graph:
            return True
        return False

    def add_edge(self, v1, v2, weight):
        """."""
        if v1 is not self.graph or v2 is not self.graph:
            return
        self.graph[v1][v2] = weight

    def get_neighbors(self, val):
        """."""
        if self.has_vert(val):
            print(self.graph[val].keys())
            return self.graph[val].keys()
        return False
