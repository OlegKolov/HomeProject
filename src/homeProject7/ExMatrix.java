package homeProject7;

import java.util.Scanner;

public class ExMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{2, 3, 4},{5, 6, 7},{9, 8, 7}};
        int[][] matrix2 = {{1, 3, 7},{7, 4, 1},{2, 6, 9}};
        Matrix matrixO = new Matrix(matrix, 3, 3);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1 - summMatrix, 2 - summNumber, 3 - print, 0 - exit");
            switch (sc.nextInt()) {
                case 1:
                    matrixO.matrix = matrixO.summ(matrix2);
                    break;
                case 2:
                    matrixO.matrix = matrixO.summNum(2);
                    break;
                case 3:
                    matrixO.printMatrix();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Try again");
                    break;
            }
        } while (true);
    }
}
