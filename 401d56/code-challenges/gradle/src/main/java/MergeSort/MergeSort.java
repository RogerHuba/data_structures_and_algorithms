package MergeSort;

public class MergeSort {

    public static void mergeSort(int[] newArray, int arrayLength){

        if(arrayLength < 2){
            return;
        }
        // Divides the array in half
        int middle = arrayLength / 2;

        // Sets the left array
        int left[] = new int[middle];

        // Sets the right array
        int right[] = new int[arrayLength-middle];

        //
        for(int i = 0; i < middle; i++){
            left[i] = newArray[i];
        }
        for(int i = middle; i < arrayLength; i++){
            right[i - middle] = newArray[i];
        }
        mergeSort(left, middle);
        mergeSort(right, arrayLength - middle);

        merge(newArray, left, right, middle, arrayLength - middle);
    }

    public static void merge(
            int[] newArray, int[] left, int[] right, int leftLength, int rightLength) {

        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                newArray[k++] = left[i++];
            }
            else {
                newArray[k++] = right[j++];
            }
        }
        while (i < leftLength) {
            newArray[k++] = left[i++];
        }
        while (j < rightLength) {
            newArray[k++] = right[j++];
        }
    }
}
