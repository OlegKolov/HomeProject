package homeProject7;

import java.util.Arrays;

public class Matrix {
    int[][] matrix;
    int line;
    int column;

    public Matrix(int[][] matrix, int line, int column) {
        this.matrix = matrix;
        this.line = line;
        this.column = column;
    }

    int[][] summ(int[][] addMatrix){
        int[][] resultMatrix = new int[this.line][this.column];
        for(int i = 0; i < this.line; i++){
            for(int j = 0; j < this.column; j++){
                resultMatrix[i][j] = this.matrix[i][j] + addMatrix[i][j];
            }
        }
        return resultMatrix;
    }

    int[][] summNum(int addNumber){
        int[][] resultMatrix = new int[this.line][this.column];
        for(int i = 0; i < this.line; i++){
            for(int j = 0; j < this.column; j++){
                resultMatrix[i][j] = this.matrix[i][j] + addNumber;
            }
        }
        return resultMatrix;
    }

    void printMatrix(){
        System.out.println(Arrays.deepToString(matrix));
    }
}
