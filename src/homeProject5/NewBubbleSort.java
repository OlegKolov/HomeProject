package homeProject5;

import java.util.Arrays;
import java.util.Scanner;

public class NewBubbleSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(Arrays.toString(array));
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.println(" => " + Arrays.toString(array));
            System.out.println("Print 'y' to finish sort, anything else to continue");
            Scanner sc = new Scanner(System.in);
            if ("y".equals(sc.next())) {
                System.exit(0);
            }
        }
    }
}
