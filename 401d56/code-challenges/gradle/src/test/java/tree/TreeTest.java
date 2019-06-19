package tree;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class TreeTest {


    private Tree createTestTree() {
        Tree newTree = new Tree();

        newTree.add(20);
        newTree.add(10);
        newTree.add(30);
        newTree.add(5);
        newTree.add(15);
        newTree.add(25);
        newTree.add(35);
        newTree.add(1);
        newTree.add(6);
        newTree.add(12);
        newTree.add(18);
        newTree.add(21);
        newTree.add(29);
        newTree.add(40);
        newTree.add(45);
        return newTree;
    }

    @Test
    public void createAnEmptyTree(){
        Tree newTree = new Tree();
        assertNotNull(newTree);
    }

    @Test
    public void addRootValueToTree(){
        Tree newTree = new Tree();
        newTree.add(20);
        assertEquals("Root Value Should be 20", 20, newTree.root.data);
    }

    @Test
    public void addLefValueToRootValue(){
        Tree newTree = new Tree();
        newTree.add(20);
        newTree.add(10);
        assertEquals("Root Value Should be 20", 20, newTree.root.data);
        assertEquals("Root Left Value Should be 10", 10, newTree.root.left.data);
    }

    @Test
    public void addRightValueToRootValue(){
        Tree newTree = new Tree();
        newTree.add(20);
        newTree.add(30);
        assertEquals("Root Value Should be 20", 20, newTree.root.data);
        assertEquals("Root Left Value Should be 30", 30, newTree.root.right.data);
    }

    @Test
    public void addLeftAndRightValueToRootValue(){
        Tree newTree = new Tree();
        newTree.add(20);
        newTree.add(10);
        newTree.add(30);
        assertEquals("Root Value Should be 20", 20, newTree.root.data);
        assertEquals("Root Left Value Should be 10", 10, newTree.root.left.data);
        assertEquals("Root Right Value Should be 30", 30, newTree.root.right.data);
    }

    @Test
    public void doesTreeContainAValue(){
        Tree newTree = createTestTree();
        assertTrue(newTree.containsNode(12));
        assertTrue(newTree.containsNode(45));
        assertFalse(newTree.containsNode(92));
        assertFalse(newTree.containsNode(0));
    }

    @Test
    public void getInOrder(){
        // Left, Root, Right
        Tree newTree = createTestTree();
        ArrayList<Integer> newArray = new ArrayList<>();
        newTree.inOrder(newTree.root, newArray);
        int firstElement = newArray.get(0);
        int secondElement = newArray.get(1);
        assertEquals("The first Array Item will be 1(left)", 1, firstElement);
        assertEquals("The first Array Item will be 5", 5, secondElement);
    }

    @Test
    public void getPreOrder(){
        //Root, left, Right
        Tree newTree = createTestTree();
        ArrayList<Integer> newArray = new ArrayList<>();
        newTree.preOrder(newTree.root, newArray);
        int firstElement = newArray.get(0);
        System.out.println("\n\nFirst Element is: " + firstElement);
        int secondElement = newArray.get(1);
        assertEquals("The first Array Item will be 20(root)", 20, firstElement);
        assertEquals("The first Array Item will be 10", 10, secondElement);
    }

    @Test
    public void getPostOrder(){
        // Left, Right, Root
        Tree newTree = createTestTree();
        ArrayList<Integer> newArray = new ArrayList<>();
        newTree.postOrder(newTree.root, newArray);
        int firstElement = newArray.get(0);
        int secondElement = newArray.get(1);
        System.out.println("\n\nFirst Element is: " + firstElement);
        assertEquals("The first Array Item will be 1(left)", 1, firstElement);
        assertEquals("The first Array Item will be 6", 6, secondElement);
    }

    @Test
    public void getbreadthFirst(){
        Tree newTree = createTestTree();
        String treeList = newTree.breadthFirst();
        assertEquals("List equals 20 10 30 5 15 25 35 1 6 12 18 21 29 40 45 ",
                "20 10 30 5 15 25 35 1 6 12 18 21 29 40 45 ",
                treeList);
    }
}