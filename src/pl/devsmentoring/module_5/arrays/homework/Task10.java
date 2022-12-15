package pl.devsmentoring.module_5.arrays.homework;

public class Task10 {

    public static void main(String[] args) {

        //   int[][] Array2d = new int[10][3];
        // int value = 1;
        //for (int i = 0; i < Array2d.length; i++) {
        //  for (int j = 0; j < Array2d[i].length; j++) {
        //    Array2d[i][j] = value;
        //  value++;


        //   System.out.println(i);
        //      }
//    }


        int[][] Array2 = new int[][];
        Array2[0] = new int[1];
        Array2[1] = new int[2];
        Array2[2] = new int[3];
        Array2[3] = new int[4];
        Array2[4] = new int[5];
        Array2[5] = new int[6];
        Array2[6] = new int[7];
        Array2[7] = new int[8];
        Array2[8] = new int[9];
        Array2[9] = new int[10];

        for (int[] subArray2 : Array2){
            for (int elem : subArray2){
                System.out.println(elem + " ");
            }
            System.out.println();
        }
    }
}
