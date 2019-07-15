package Graph;

import java.util.HashSet;

public class Node<T> {
    public T data;
    public HashSet<Edge> neighbors;

    public Node(T data){
        this.data = data;
        this.neighbors = new HashSet<>();
    }

    public boolean addNeighbor(Node<T> node){
        Edge edge = new Edge(node);
        this.neighbors.add(edge);
        return true;
    }

    public boolean addNeighbor(Node<T> node, int weight){
        Edge edge = new Edge(node, weight);
        this.neighbors.add(edge);
        return true;
    }

    public String toString(){

        return this.data.toString();
    }
}