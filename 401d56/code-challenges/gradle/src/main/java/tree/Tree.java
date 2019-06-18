package tree;


import java.util.ArrayList;

public class Tree {

    protected Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }
    }

    private Node addNode(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addNode(current.left, data);
        } else if (data > current.data) {
            current.right = addNode(current.right, data);
        } else {
            return current;
        }

        return current;
    }

    public void add(int data) {
        root = addNode(root, data);
    }

    private boolean containsNode(Node current, int data) {
        if (current == null) {
            return false;
        }
        if (data == current.data) {
            return true;
        }
        if(data < current.data){
            return containsNode(current.left, data);
        } else {
            return containsNode(current.right, data);
        }
//      The following lines of code are the same as above.  Here for training purposes.
//        return data < current.data
//                ? containsNode(current.left, data)
//                : containsNode(current.right, data);
    }

    boolean containsNode(int data) {
        return containsNode(root, data);
    }

    ArrayList inOrder(Tree.Node node, ArrayList newArray) {
        if (node != null) {
            inOrder(node.left, newArray);
            System.out.print(" " + node.data);
            newArray.add(node.data);
            inOrder(node.right, newArray);
        }
        return newArray;
    }

    ArrayList preOrder(Tree.Node node, ArrayList newArray) {
        if (node != null) {
            System.out.print(" " + node.data);
            newArray.add(node.data);
            preOrder(node.left, newArray);
            preOrder(node.right, newArray);
        }
        return newArray;
    }

    ArrayList postOrder(Tree.Node node, ArrayList newArray) {
        if (node != null) {
            postOrder(node.left, newArray);
            postOrder(node.right, newArray);
            System.out.print(" " + node.data);
            newArray.add(node.data);
        }
        return newArray;
    }

}
