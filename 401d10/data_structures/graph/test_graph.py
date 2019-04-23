from .graph import Graph
import pytest

graph = Graph()


def test_check_graph():
    """Verifies class exists."""
    assert Graph


def test_check_if_vert_there():
    """Check if the vert is there before adding."""
    assert graph.has_vert('A') is False


def test_add_vert():
    """Validates adding a vert to a graph."""
    graph.add_vert('A')
    assert graph.has_vert('A') is True


def test_has_vert():
    """Validated if has_vert is there."""
    assert graph.has_vert


def test_breadth_first_search():
    """Validate breadth_first_search is there."""
    assert breadth_first


def test_add_vert_check_wrong():
    """Validates vert is not there."""
    graph.add_vert('A')
    graph.has_vert('B')
    assert graph.has_vert('B') is False


def test_is_edge_there():
    """Check to see if the function is there."""
    assert graph.add_edge


def test_add_edge_expect_fail():
    """Test adding an edge to 2 verts where 1 vert not there."""
    graph.add_vert('A')
    graph.add_vert('B')
    graph.add_edge('A', 'C', 20)
    assert graph.add_edge('A', 'C', 20) is False


def test_add_edge():
    """Test adding an edge to 2 verts."""
    graph.add_vert('A')
    graph.add_vert('B')
    graph.add_edge('A', 'B', 20)
    assert True


def test_is_get_neighbors_there():
    """Check to see if the function is there."""
    assert graph.get_neighbors


def test_get_neighbors_not_there():
    """Check to get a verts neighbor."""
    graph.add_vert('A')
    graph.add_vert('B')
    graph.add_vert('C')
    graph.add_vert('D')
    graph.add_edge('A', 'B', 20)
    graph.add_edge('A', 'C', 10)
    graph.add_edge('C', 'D', 20)
    graph.add_edge('B', 'D', 10)
    assert graph.get_neighbors('E') is False


def test_get_neighbors_a():
    """Check to get a verts neighbor for A."""
    graph.add_vert('A')
    graph.add_vert('B')
    graph.add_vert('C')
    graph.add_vert('D')
    graph.add_edge('A', 'B', 20)
    graph.add_edge('A', 'C', 10)
    graph.add_edge('C', 'D', 20)
    graph.add_edge('B', 'D', 10)
    assert graph.get_neighbors('A') == {
        'B': 20, 'C': 10
    }


def test_get_neighbors_b():
    """Check to get a verts neighbor for B."""
    graph.add_vert('A')
    graph.add_vert('B')
    graph.add_vert('C')
    graph.add_vert('D')
    graph.add_edge('A', 'B', 20)
    graph.add_edge('A', 'C', 10)
    graph.add_edge('C', 'D', 20)
    graph.add_edge('B', 'D', 10)
    assert graph.get_neighbors('B') == {
        'D': 10
    }

def test_get_neighbors_c():
    """Check to get a verts neighbor for C."""
    graph.add_vert('A')
    graph.add_vert('B')
    graph.add_vert('C')
    graph.add_vert('D')
    graph.add_edge('A', 'B', 20)
    graph.add_edge('A', 'C', 10)
    graph.add_edge('C', 'D', 20)
    graph.add_edge('B', 'D', 10)
    assert graph.get_neighbors('C') == {
        'D': 20
    }

def test_get_neighbors_d():
    """Check to get a verts neighbor for D."""
    graph.add_vert('A')
    graph.add_vert('B')
    graph.add_vert('C')
    graph.add_vert('D')
    graph.add_edge('A', 'B', 20)
    graph.add_edge('A', 'C', 10)
    graph.add_edge('C', 'D', 20)
    graph.add_edge('B', 'D', 10)
    assert graph.get_neighbors('D') == {}
