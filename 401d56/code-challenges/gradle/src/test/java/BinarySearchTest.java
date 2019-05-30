import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testBinarySearchPassRightResult(){
        BinarySearch arrayBinarySearch = new BinarySearch();
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6};
        int value = 5;
        int expectedOutput= 5;
        assertEquals("Check an array to see if it contains a 5.  It will pass.",
                expectedOutput, arrayBinarySearch.binSearch(inputArray,value));
    }

    @Test
    public void testBinarySearchPassRightEndResult(){
        BinarySearch arrayBinarySearch = new BinarySearch();
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6};
        int value = 4;
        int expectedOutput= 4;
        assertEquals("Check an array to see if it contains a 4.  It will pass.",
                expectedOutput, arrayBinarySearch.binSearch(inputArray,value));
    }

    @Test
    public void testBinarySearchPassLeftResult(){
        BinarySearch arrayBinarySearch = new BinarySearch();
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6};
        int value = 2;
        int expectedOutput= 2;
        assertEquals("Check an array to see if it contains a 2.  It will pass.",
                expectedOutput, arrayBinarySearch.binSearch(inputArray,value));
    }

    @Test
    public void testBinarySearchFailRightResult(){
        BinarySearch arrayBinarySearch = new BinarySearch();
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6};
        int value = 10;
        int expectedOutput= -1;
        assertEquals("Check an array to see if it contains a 10.  It will fail.",
                expectedOutput, arrayBinarySearch.binSearch(inputArray,value));
    }
}