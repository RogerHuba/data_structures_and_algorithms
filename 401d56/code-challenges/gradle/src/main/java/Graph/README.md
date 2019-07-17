# Graphs
Implementation of a Graph

## Challenge
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

 - AddNode()
    - Adds a new node to the graph
    - Takes in the value of that node
    - Returns the added node
- AddEdge()
    - Adds a new edge between two nodes in the graph
    - Include the ability to have a “weight”
    - Takes in the two nodes to be connected by the edge
    - Both nodes should already be in the Graph
- GetNodes()
    - Returns all of the nodes in the graph as a collection (set, list, or similar)
- GetNeighbors()
    - Returns a collection of nodes connected to the given node
    - Takes in a given node
    - Include the weight of the connection in the returned collection
- Size()
    - Returns the total number of nodes in the graph
-breadthFirst()
    - Completes a breadth first traversal.
-depthFirst()
    - Completed a depth first traversal.

##
Get Edges - Returns a T/F and a cost if travel is possible.

## Approach & Efficiency
O(n)

## API
addNode
addEdge
getNodes
getNeighbors
size
breadthFirst
depthFirst
