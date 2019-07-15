package Graph;

import java.util.LinkedList;

public class Graph {
    int Vertex;
    LinkedList<Integer> adjListArray[];
    Graph(int Vertex) {
        this.Vertex = Vertex;
        adjListArray = new LinkedList[Vertex];

        for(int i = 0; i < Vertex ; i++){
            adjListArray[i] = new LinkedList<>();
            }
        }

    static void addEdge(Graph graph, int src, int dest)
    {
        graph.adjListArray[src].add(dest);

        graph.adjListArray[dest].add(src);
    }



    public void AddNode(){
        //TODO: AddNode
//        Adds a new node to the graph
//        Takes in the value of that node
//        Returns the added node
    }
    
    public void RemoveNode(){
        //TODO: RemoveNode
//        Adds a new node to the graph
//        Takes in the value of that node
//        Returns the added node
    }

    public void AddEdge(){
        //TODO: AddEdge
//        Adds a new edge between two nodes in the graph
//        Include the ability to have a “weight”
//        Takes in the two nodes to be connected by the edge
//        Both nodes should already be in the Graph
    }

    public void GetNodes() {
        //TODO: GetNodes
//        Returns all of the nodes in the graph as a collection(set, list, or similar)
    }

    public void GetNeighbors() {
        //TODO: GetNeighbors
//        Returns a collection of nodes connected to the given node
//        Takes in a given node
//        Include the weight of the connection in the returned collection
    }

    public void Size() {
        //TODO: getSize
//        Returns the total number of nodes in the graph
    }
}
