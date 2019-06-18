package tree;

import java.util.ArrayList;

public class FizzBuzzTree {

    private Node root;

    class Node {
        Object data;
        Node left;
        Node right;

        Node(Object data) {
            this.data = data;
            right = null;
            left = null;
        }
    }

    ArrayList fizzBuzzTraversal(Node node, ArrayList newArray) {
        if (node != null) {
            fizzBuzzTraversal(node.left, newArray);
            int value = (int) node.data;
            if(value%3 == 0 && value%5 == 0){
                node.data = "fizzbuzz";
            }else if(value%3 == 0){
                node.data = "fizz";
            }else if (value%5 == 0){
                node.data = "buzz";
            }
            System.out.print(" " + node.data);
            newArray.add(node.data);
            fizzBuzzTraversal(node.right, newArray);
        }
        return newArray;
    }
}
