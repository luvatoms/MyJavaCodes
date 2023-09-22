//to print a matrix in spiral form or manner 
// i for row and j for column

public class Matrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix.length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // top part
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // right part
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom part
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endCol) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // left part
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }
    }

    // for diagonal sum of any square matrix
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        // for(int i = 0;i<matrix.length;i++){
        // for(int j =0;j<matrix[0].length;j++){
        // if(i==j){
        // sum+=matrix[i][j];
        // }
        // else if(i+j==matrix.length-1){
        // sum+=matrix[i][j];
        // }
        // }
        // }
        for (int i = 0; i < matrix.length; i++) {
            // primary dio.
            sum += matrix[i][i];
            // secondary dio.
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1];
            }

        }
        return sum;

    }
    //search in sorted matrix 
    public static void main

    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
          System.out.print(diagonalSum(matrix));
    }

}
