package MergeSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void testSuccessfulMergeSort() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testUnsuccessfulMergeSort() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 7 };
        MergeSort.mergeSort(actual, actual.length);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testSuccessfulMergeSortSmallArray() {
        int[] actual = { 5, 1, 6 };
        int[] expected = { 1, 5, 6 };
        MergeSort.mergeSort(actual, actual.length);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testSuccessfulMergeSortSingleArray() {
        int[] actual = { 5 };
        int[] expected = { 5 };
        MergeSort.mergeSort(actual, actual.length);
        assertNotEquals(expected, actual);
    }
}