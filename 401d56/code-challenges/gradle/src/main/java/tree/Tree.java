package tree;

import java.util.ArrayList;

public class Tree {

    protected Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int value) {
            this.data = value;
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

    public void add(int value) {
        root = addNode(root, value);
    }

    private boolean containsNode(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.data) {
            return true;
        }
        return value < current.data
                ? containsNode(current.left, value)
                : containsNode(current.right, value);
    }

    boolean containsNode(int value) {
        return containsNode(root, value);
    }

    ArrayList inOrder(Node node, ArrayList newArray) {
        if (node != null) {
            inOrder(node.left, newArray);
            System.out.print(" " + node.data);
            newArray.add(node.data);
            inOrder(node.right, newArray);
        }
        return newArray;
    }

    ArrayList preOrder(Node node, ArrayList newArray) {
        if (node != null) {
            System.out.print(" " + node.data);
            newArray.add(node.data);
            preOrder(node.left, newArray);
            preOrder(node.right, newArray);
        }
        return newArray;
    }

    ArrayList postOrder(Node node, ArrayList newArray) {
        if (node != null) {
            postOrder(node.left, newArray);
            postOrder(node.right, newArray);
            System.out.print(" " + node.data);
            newArray.add(node.data);
        }
        return newArray;
    }
}
