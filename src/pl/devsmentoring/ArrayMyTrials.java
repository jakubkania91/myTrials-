package pl.devsmentoring;

import java.util.Arrays;

public class ArrayMyTrials {
    public static void main(String[] args) {

        int[][] numbers = new int[8][3];
        numbers[0][0] = 2;
        numbers[0][1] = 4;
        numbers[0][2] = 8;
        System.out.println(Arrays.deepToString(numbers));

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
        }

    }
}
