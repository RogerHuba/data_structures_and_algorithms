class Vertex:
    def __init__(self, vertex=None):
        """Constructs a vertex"""
        self.vertex = vertex

    def __repr__(self):
        """Set up a graph with vertices"""
        return f'Graph: {self.vertex}'

    def __str__(self):
        """An official String representation of the vertice object"""
        return f'Graph: {self.vertex}'


class Graph:
    """Class to create graph."""

    def __init__(self):
        """Constructs and empty graph."""
        self.graph = {}

    def __repr__(self):
        """."""
        return f'Graph: {self.graph} Size: {len(self.graph)}'

    def __str__(self):
        """."""
        return  f'Graph: {self.graph}'

    def __len__(self):
        """Length of the graph."""
        return len(self.graph)

    def add_vert(self, val):
        """Add a vertex to the graph."""
        if self.has_vert(val):
            return 'Already has the vertex!'
        self.graph[val] = {}

    def has_vert(self, val):
        """Check if a vertex."""
        if val in self.graph.keys():
            return True
        return False

    def add_edge(self, v1, v2, weight):
        """."""
        if self.has_vert(v1) is False:
            return 'No Vertex found'
        if v2 not in self.graph[v1]:
            self.graph[v1][v2] = weight
        else:
            return 'Edge already exist'

    def get_neighbors(self, val):
        """."""
        if self.has_vert(val) is False:
            return 'No vertex Found'
        elif self.graph[val].keys():
            n.append(k)
        else:
            return None

    def breadth_first(self, starting):
        """Complete a breadth first search on a graph."""
        visited = []
        queue = [starting]
        while queue:
            vert = queue.pop(0)
            try:
                if vertex not in visited:
                    visited.append(vert)

                    neighbors = self.get_neighbors(vert)

                    for neighbor in neighbors:
                        queue.apend(neighbor)
            except AssertionError:
                return None
        return visited       

    def get_edge(self, destination):
        """See of a destination is an attached vert."""
        
        return 
    
    def depth_first(self, starting):
        """Complete a depth first search on the graph.""" 
        visited = []

        def _walk(vert):
            visited.append(vert)
            for neighbors in self.graph[vert]:
                if neighbors not in visited:
                    _walk(neighbors)
        _walk(starting)
        return visited
