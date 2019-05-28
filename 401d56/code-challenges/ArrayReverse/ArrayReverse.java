import java.util.Arrays;

public class ArrayReverse {
    public static void main (String[] args) {
        // create the array to test your code on later
        int[] startArr = new int[] {1,2,3,4,5,10};
        // print it out, nicely
        System.out.println(Arrays.toString(startArr));
        // call your reverseArray method and save the result in a variable
        int[] endArr = reverseArray(startArr);
        // print out the result, nicely
        System.out.println(Arrays.toString(endArr));
    }

    // the method you should write, to reverse an array
    public static int[] reverseArray(int[] inputArray) {
        // initialize holder, start, and end
        int temp;
        int start = 0;
        int end = inputArray.length - 1;

        while (start < end) {
            temp = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = temp;
            start++;
            end--;
        }
        return inputArray;
    }
}