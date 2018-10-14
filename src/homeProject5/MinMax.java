package homeProject5;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        SortForMinMax sort = new SortForMinMax();
        int[] arrayToSort = new int[8];
        int[][] resultArray = new int[5][2];
        int[][] array = {{23, 13, 98, 48, 54, 22, 34, 12},
                {15, 13, 67, 22, 54, 22, 19, 12},
                {12, 17, 98, 42, 28, 34, 34, 72},
                {86, 55, 93, 48, 92, 22, 34, 12},
                {66, 13, 77, 98, 66, 31, 67, 23}};
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                arrayToSort[j] = array[i][j];
            }
            int[] sortedArray = sort.sort(arrayToSort);

            resultArray[i][0] = sortedArray[0];
            resultArray[i][1] = sortedArray[7];
        }
        System.out.println(Arrays.deepToString(resultArray));
    }
}
