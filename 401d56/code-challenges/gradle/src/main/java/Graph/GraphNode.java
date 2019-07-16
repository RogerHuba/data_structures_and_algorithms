package Graph;

import java.util.LinkedList;
import java.util.List;

public class GraphNode {

    String name;
    List<GraphNode> neighbors;

    public static void main(String[] args){
        GraphNode willNode = new GraphNode("Will");
        GraphNode lizNode = new GraphNode("Liz");
        GraphNode xiaNode = new GraphNode("Xia");
        GraphNode lukeNode = new GraphNode("Luke");
        GraphNode yuenNode = new GraphNode("Yuan");
        GraphNode kushNode = new GraphNode("Kush");

        xiaNode.addNeighbor(lizNode);
        xiaNode.addNeighbor(willNode);
        xiaNode.addNeighbor(lukeNode);
        lizNode.addNeighbor(lukeNode);
    }

    GraphNode[][] potentialPairs = {
            {willNode, lukeNode},
            {xiaNode, lizNode},
            {yuanode, kushNode}
    };
    
    public void GraphNode(String name){
        this.name = name;
        this.neighbors = new LinkedList<>();
    }



    public void addNeighbor(GraphNode newNeighbor){
        // if statement
        this.neighbors.add(newNeighbor);
        newNeighbor.neighbors.add(this);
    }
}
