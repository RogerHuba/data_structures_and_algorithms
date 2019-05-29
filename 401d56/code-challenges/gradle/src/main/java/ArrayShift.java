import java.lang.*;

public class ArrayShift {

    public static int[] shiftArray(int[] inputArray, int value) {
        int[] newArray = new int[inputArray.length + 1];
        int halfWay = 0;
        if (inputArray.length %2 == 0) {
            halfWay = (inputArray.length / 2) -1;
        } else {
            halfWay = (inputArray.length / 2);
        }

        if (inputArray.length == 0) {
            newArray[0] = value;
        } else {
            for (int i = 0; i < newArray.length; i++) {
                if (i <= halfWay) {
                    newArray[i] = inputArray[i];
                } else if ((i >= halfWay) && i - 1 == halfWay) {
                    newArray[i] = value;
                } else {
                    newArray[i] = inputArray[i - 1];
                }
            }
        }
        return newArray;
    }
}