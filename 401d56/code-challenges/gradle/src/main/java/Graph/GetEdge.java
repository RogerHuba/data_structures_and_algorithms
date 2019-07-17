package Graph;

import java.util.HashSet;

public class GetEdge {

    public static String flIt(String[] city, Graph map){

        int cost = 0;
        String result = "False";
        Node node = null;
        boolean direct = false;

        for (Node n : (HashSet<Node>)map.getNodes()){
            if (n.data == city[0]){
                node = n;
            }
        }

        if (node == null){
            return result;
        }

        for (int i = 1; i < city.length; i++){
            for (Edge e : (HashSet<Edge>) map.getNeighbors(node)){
                if (city[i] == e.node.data){
                    cost += e.weight;
                    node = e.node;
                    result = "True, $" + cost;
                    direct = true;
                }
            }

            if (direct){
                direct = false;
            } else {
                return "False";
            }
        }

        return result;
    }
}