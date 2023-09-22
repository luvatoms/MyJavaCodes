package Backtracing;
//print one solution 
public class print1solnNqueen {
   
        public static void main(String args[]) {
            int n = 4;
            char board[][] = new char[n][n];
            // initialize
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = 'X';
                }
    
            }
            if(nqueen(board, 0)){
                System.out.println("soln is possible");
                printBoard(board);
            }else{
                System.out.println("solution is not possible");
            }
            
            
        }
    
        public static boolean isSafe(char board[][], int row, int col) {
            // vertical
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][col] == 'Q') {
                    return false;
                }
    
            }
            // left diogonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
            // right diogonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
            return true;
        }
    
        public static boolean nqueen(char board[][], int row) {
            // base
            if (row == board.length) {
               
                return true;
            }
            // column loop
            for (int j = 0; j < board.length; j++) {
                if (isSafe(board, row, j)) {
                    board[row][j] = 'Q';
                    if(nqueen(board, row + 1)){
                        return true;}

                    board[row][j] = 'X';// backtracking step to remove alloted queen during backtracking
                }
            }
            return false;
    
        }
    
        public static void printBoard(char board[][]) {
            System.out.println("---------------");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
    
    }  

