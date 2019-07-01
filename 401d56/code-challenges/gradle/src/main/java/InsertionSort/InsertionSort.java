package InsertionSort;

import java.lang.reflect.Array;

public class InsertionSort {

    public static int[] sortArray(int array[]) {
        int arrayLength = array.length;
        for(int i=0;i< arrayLength; i++){
            int key = array[i];
            int j = i-1;
            while ((j > -1) && ( array [j] > key )){
                array [j + 1] = array [j];
                j--;
            }
            array[j+1] = key;
        }
        return array;
    }
}
