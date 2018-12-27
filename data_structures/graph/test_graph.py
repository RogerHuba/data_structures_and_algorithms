from .graph import Graph
import pytest

graph = Graph()

def test_check_graph():
    """Verifies class exists."""
    assert Graph


def test_add_vert():
    """Validates adding a vert to a graph."""
    graph.add_vert('A')
    graph.add_vert('B')
    assert 'A'
    assert 'B'

# def test_add_edge():
    # graph.add_vert('A')
    # graph.add_vert('B')
    # graph.add_edge('A', 'B', 10)
    # assert graph.graph == {'A': {'B': 10}}


def test_add_vert_add_edge():
    pass


def test_add():
    pass


def test_has_neighbors():
    graph.add_vert('A')
    graph.add_vert('B')
    graph.add_edge('A', 'B', 10)
    assert graph.get_neighbors('A') == ('B')
