package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void createAnEmptyTree(){
        FizzBuzzTree newTree = new FizzBuzzTree();
        assertNotNull(newTree);
    }

    @Test
    public void testFizzBuzzValues() {
        FizzBuzzTree newTree = new FizzBuzzTree();
//        newTree.root =  new FizzBuzzTree.Node(3);
//        newTree.root.left = new FizzBuzzTree.Node(15);
//        newTree.root.right = new FizzBuzzTree.Node(5);
        assertEquals("Should be Fizz", "Fizz", newTree.root.data);
        assertEquals("Should be FizzBuzz", newTree.root.left.data);
        assertEquals("Should be Buzz", newTree.root.right.data);
    }
}