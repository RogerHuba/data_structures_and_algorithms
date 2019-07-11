package hashtable;

import org.junit.Test;
import tree.Tree;

import java.util.ArrayList;

import static hashtable.TreeIntersection.getIntersectingTreeValues;
import static org.junit.Assert.*;

public class TreeIntersectionTest {

    private Tree createTestSmallTreeOne() {
        // Duplicate with Two is 10
        Tree newTree = new Tree();
        newTree.add(10);
        newTree.add(20);
        newTree.add(5);
        newTree.add(30);
        return newTree;
    }

    private Tree createTestSmallTreeTwo() {
        // Duplicate with One is 10
        Tree newTree = new Tree();
        newTree.add(21);
        newTree.add(25);
        newTree.add(31);
        newTree.add(10);
        return newTree;
    }

    private Tree createTestLargeTreeOne() {
        // Duplicate with Two is 10, 30, 300
        Tree newTree = new Tree();
        newTree.add(10);
        newTree.add(20);
        newTree.add(5);
        newTree.add(30);
        newTree.add(100);
        newTree.add(200);
        newTree.add(50);
        newTree.add(300);
        return newTree;
    }

    private Tree createTestLargeTreeTwo() {
        // Duplicate with One is 10, 30, 300
        Tree newTree = new Tree();
        newTree.add(21);
        newTree.add(25);
        newTree.add(30);
        newTree.add(10);
        newTree.add(210);
        newTree.add(250);
        newTree.add(300);
        newTree.add(100);
        return newTree;
    }

    @Test
    public void createAnEmptyTree(){
        Tree newTree = new Tree();
        assertNotNull(newTree);
    }

    @Test
    public void createAnEmptyHashtable(){
        Hashtable ht = new Hashtable(1);
        assertNotNull(ht);
    }

    @Test
    public void testAddOneTree(){
        Tree newTree = createTestSmallTreeOne();
        assertEquals("Root Value Should be 10", 10, newTree.root.data);
    }

    @Test
    public void testAddTwoTree(){
        Tree newTree1 = createTestSmallTreeOne();
        Tree newTree2 = createTestSmallTreeTwo();
        assertEquals("Root Value Should be 10", 10, newTree1.root.data);
        assertEquals("Root Value Should be 21", 21, newTree2.root.data);
    }

    @Test
    public void testGetSingleReturn(){
        Tree newTree1 = createTestSmallTreeOne();
        Tree newTree2 = createTestSmallTreeTwo();
        ArrayList<Integer> newArr = getIntersectingTreeValues(newTree1, newTree2);
        assertEquals("List equals 10", "10", newArr);
    }

    @Test
    public void testGetMultipleReturnValue(){
        Tree newTree1 = createTestLargeTreeOne();
        Tree newTree2 = createTestLargeTreeTwo();
        ArrayList<Integer> newArr = getIntersectingTreeValues(newTree1, newTree2);
        assertEquals("List equals 10, 30, 300 ", "10 30 100", newArr);
    }

    @Test
    public void testNoDuplicateValues(){
        Tree newTree1 = new Tree();
        newTree1.add(10);
        newTree1.add(20);
        newTree1.add(30);
        Tree newTree2 = new Tree();
        newTree2.add(5);
        newTree2.add(15);
        newTree2.add(25);
        ArrayList<Integer> newArr = getIntersectingTreeValues(newTree1, newTree2);
        assertNull(newArr);
    }

    @Test
    public void testTreeTwoEmpty(){
        Tree newTree1 = createTestSmallTreeOne();
        Tree newTree2 = new Tree();
        ArrayList<Integer> newArr = getIntersectingTreeValues(newTree1, newTree2);
        assertNull(newArr);

    }

    @Test
    public void testTreeOneEmpty(){
        Tree newTree1 = new Tree();
        Tree newTree2 = createTestSmallTreeTwo();
        ArrayList<Integer> newArr = getIntersectingTreeValues(newTree1, newTree2);
        assertNull(newArr);
    }

}