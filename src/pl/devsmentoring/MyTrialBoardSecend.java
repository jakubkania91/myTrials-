package pl.devsmentoring;

import java.util.Arrays;

public class MyTrialBoardSecend {
    public static void main(String[] args) {
        int[] myArray = new int[]{3, 5, 7, 2, -1, -8, 2, 1, 5, 4};

        System.out.println("array: " + Arrays.toString(myArray));
        for (int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        System.out.println("array: " + Arrays.toString(myArray));
    }
}
