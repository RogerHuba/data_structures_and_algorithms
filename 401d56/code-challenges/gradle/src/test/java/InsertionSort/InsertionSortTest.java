package InsertionSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

    public int[] createArray(){
     int newArr[] = {10, 2, 5, 9, 1, 4, 7};
     return newArr;
    }

    @Test
    public void testCreateArray(){
        int compareArray[] = {10, 2, 5, 9, 1, 4, 7};
        int newArr[] = createArray();
        assertArrayEquals(compareArray, newArr);
    }

    @Test
    public void testInsertionSort(){
        int compareArray[] = {1, 2, 4, 5, 7, 9, 10};
        int newArr[] = InsertionSort.sortArray(createArray());
        assertArrayEquals(compareArray, newArr);
    }

    @Test
    public void testInsertionSortForceFail(){
        int compareArray[] = {1, 2, 4, 5, 7, 10, 9};
        int newArr[] = InsertionSort.sortArray(createArray());
        assertFalse(Arrays.equals(compareArray, newArr));
    }
}