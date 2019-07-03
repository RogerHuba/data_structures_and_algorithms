package QuickSort;

public class QuickSort {

    public static void quickSort(int arr[], int start, int end) {
        if (start < end) {
            int partitionIndex = partition(arr, start, end);

            quickSort(arr, start, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = (start-1);

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        return i+1;
    }
}

