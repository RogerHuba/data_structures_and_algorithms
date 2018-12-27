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
        if v1 in self.graph:
            if v2 in self.graph:
                self.graph[v1][v2] = weight
                # import pdb; pdb.set_trace()
                return self.graph[v1][v2]
        return False


    def get_neighbors(self, val):
        """."""
        if self.has_vert(val):
            return self.graph[val]
        return False
