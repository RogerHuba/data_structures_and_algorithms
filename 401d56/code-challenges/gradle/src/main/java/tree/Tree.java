package tree;

import stacksandqueues.Queue;

import java.util.ArrayList;

public class Tree {

    public Node root;
    int maxValue = 0;
    public class Node {
        public int data;
        public Node left;
        public Node right;

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
    }

    boolean containsNode(int data) {
        return containsNode(root, data);
    }

    public static ArrayList inOrder(Tree.Node node, ArrayList newArray) {
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

    public String breadthFirst() {
        String treeList = "";
        if (root == null) {
            return "";
        }
        Queue<Node> nodes = new Queue<>();
        nodes.enQueue(root);

        while (!nodes.isEmpty()) {
            Node node = nodes.deQueue();
            treeList += node.data + " ";
            System.out.print(node.data + "\n");
            if (node.left != null) {
                nodes.enQueue(node.left);
            }
            if (node.right!= null) {
                nodes.enQueue(node.right);
            }
        }
        System.out.println(treeList);
        return treeList;
    }

    public int findMaxValue(Node node, ArrayList newArray){

        if (node != null) {
            findMaxValue(node.left, newArray);
            if(node.data > maxValue){
                maxValue = node.data;
            }
            System.out.print(" " + node.data);
            newArray.add(node.data);
            findMaxValue(node.right, newArray);
        }
        return maxValue;
    }
}
