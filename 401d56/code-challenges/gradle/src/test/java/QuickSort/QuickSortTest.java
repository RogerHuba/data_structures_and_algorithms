package QuickSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testSuccessfulQuickSort() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        QuickSort.quickSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testUnsuccessfulQuickSort() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 7 };
        QuickSort.quickSort(actual, 0, actual.length-1);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testSuccessfulQuickSortSmallArray() {
        int[] actual = { 5, 1, 6 };
        int[] expected = { 1, 5, 6 };
        QuickSort.quickSort(actual, 0, actual.length-1);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testSuccessfulQuickSortSingleArray() {
        int[] actual = { 5 };
        int[] expected = { 5 };
        QuickSort.quickSort(actual, 0, actual.length-1);
        assertNotEquals(expected, actual);
    }
}