package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph<T>{

    private HashSet<Node<T>> nodes;

    public Graph(){
        this.nodes = new HashSet<>();
    }

    public Node<T> addNode(T data){
        Node node = new Node(data);
        this.nodes.add(node);
        return node;
    }

    public boolean addEdge(Node<T> one, Node<T> two){
        if (this.nodes.contains(one) && this.nodes.contains(two)){
            one.addNeighbor(two);
            two.addNeighbor(one);
            return true;
        }
        return false;
    }

    public boolean addEdge(Node<T> one, Node<T> two, int weight){
        if (this.nodes.contains(one) && this.nodes.contains(two)){
            one.addNeighbor(two, weight);
            two.addNeighbor(one, weight);
            return true;
        }
        return false;
    }

    public HashSet<Node<T>> getNodes() {
        return this.nodes;
    }

    public HashSet<Edge> getNeighbors(Node<T> node){
        return node.neighbors;
    }

    public int size() {
        return this.nodes.size();
    }

    public static LinkedList<Node> breadthFirst(Node node) {

        LinkedList<Node> results = new LinkedList<>();
        LinkedList<Node> visited = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        visited.add(node);

        while (!queue.isEmpty()){
            Node dequeue = queue.remove();
            results.add(dequeue);
            ArrayList<Edge> deqNeighbors = new ArrayList();

            if (dequeue.neighbors != null) {
                deqNeighbors.addAll(dequeue.neighbors);
                for(Edge e : deqNeighbors){
                    if (!visited.contains(e.node)){
                        queue.add(e.node);
                        visited.add(e.node);
                    }
                }
            }
        }
        return results;
    }
}