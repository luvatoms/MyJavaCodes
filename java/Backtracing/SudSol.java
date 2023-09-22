package Backtracing;

public class SudSol {
    public static void main(String args[]) {
        int[][] sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
                if(sudosolver(sudoku, 0, 0)){
                    System.out.println("solution exist");
                    printSudoku(sudoku);}
                    else {
                        System.out.println("soln does not exist");
                    }
                }


    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // column
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // row
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // grid
        // formula used similarly for colmn
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }

        }
        return true;

    }

    public static boolean sudosolver(int sudoku[][], int row, int col) {//recusion
        // base case
        if (row == 9) {
            return true;
        }
        // recursion
        int nxtrow = row, nxtcol = col + 1;
        if (col==8) {
            nxtrow = row + 1;
            nxtcol = 0;
        }
        if (sudoku[row][col] != 0) {//agr vha koi or dusra element hai phlr se hi toh uss space ko chorkr  aage bdh jaengai 
            return sudosolver(sudoku, nxtrow, nxtcol);
        }
        for (int digit = 1; digit <= 9; digit++) {//to test the digit with isSafe fn to every other digit in line,column,grid
            if (isSafe(sudoku, row, col, digit)) {//to tell the pc that this digit is not at any other place in sudoku
                sudoku[row][col] = digit;
                if (sudosolver(sudoku, nxtrow, nxtcol)) {
                    return true;
                }
                sudoku[row][col] = 0;//backtracking step

            }
        }
        return false;
    }
}