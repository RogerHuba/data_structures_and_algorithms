public class BinarySearch {

    public static int binSearch(int[] inputArray, int value){
        int left = 0;
        int right = inputArray.length -1;
        while(left <= right) {
            int halfWay = left + (right - left) / 2;
            System.out.println("the value at halfway" + inputArray[halfWay]);
            System.out.println("right: " + right);
            System.out.println("left: " + left);
            if(inputArray[halfWay] == value){
                return value;
            }

            if(inputArray[halfWay] < value){
                left = halfWay + 1;
                System.out.println("in the adjust left");
            } else {
                System.out.println("in the adjust right");

                right = halfWay - 1;
            }
        }
        return -1;
    }
}
//
//    int[] inputArray = new int[]{1, 2, 3, 4, 5, 6};
//    int value = 4;
