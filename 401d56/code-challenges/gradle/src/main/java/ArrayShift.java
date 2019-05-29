import java.util.Arrays;

public class ArrayShift {

    // the method you should write, to reverse an array
    public static int[] shiftArray(int[] inputArray, int value) {
        int[] newArray = new int[inputArray.length + 1];
        int halfWay = inputArray.length/2;
        for(int i=0; i < newArray.length; i++){
            if(i <= halfWay){
                newArray[i] = inputArray[i];
            } else if((i > halfWay) && i-1 == halfWay){
                newArray[i] = value;
            } else {
                newArray[i] = inputArray[i-1];
            }
        }
        System.out.println(Arrays.toString(inputArray));
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}