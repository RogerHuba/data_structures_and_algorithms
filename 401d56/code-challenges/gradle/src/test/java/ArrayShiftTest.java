import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void testArrayShiftAddToEvenArray(){
        ArrayShift arrayShiftForTest = new ArrayShift();
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6};
        int value = 10;
        int[] expectedOutput= new int[]{1, 2, 3, 10, 4,  5, 6};
        assertArrayEquals("Inserting a value and creating a new array with value in middle",
                expectedOutput, arrayShiftForTest.shiftArray(inputArray,value));
    }

    @Test
    public void testArrayShiftAddToOddArray(){
        ArrayShift arrayShiftForTest = new ArrayShift();
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int value = 10;
        int[] expectedOutput= new int[]{1, 2, 3, 4, 10,  5, 6, 7};
        assertArrayEquals("Inserting a value and creating a new array with value in middle",
                expectedOutput, arrayShiftForTest.shiftArray(inputArray,value));
    }

    @Test
    public void testArrayShiftAddToSingleArray(){
        ArrayShift arrayShiftForTest = new ArrayShift();
        int[] inputArray = new int[]{1};
        int value = 10;
        int[] expectedOutput= new int[]{1, 10};
        assertArrayEquals("Inserting a value and creating a new array with value in middle",
                expectedOutput, arrayShiftForTest.shiftArray(inputArray,value));
    }

    @Test
    public void testArrayShiftAddToEmptyArray(){
        ArrayShift arrayShiftForTest = new ArrayShift();
        int[] inputArray = new int[]{};
        int value = 10;
        int[] expectedOutput= new int[]{10};
        assertArrayEquals("Inserting a value and creating a new array with value in middle",
                expectedOutput, arrayShiftForTest.shiftArray(inputArray,value));
    }
}