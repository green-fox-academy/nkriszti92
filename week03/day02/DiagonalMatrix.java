package week03.day02;

import java.util.Arrays;

public class DiagonalMatrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    public static void main(String[] args) {

        int[][] board = new int[4][4];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (row == col) {
                    board[row][col] = 1;
                    System.out.print(board[row][col] + "\t");
                } else {
                    board[row][col] = 0;
                    System.out.print(board[row][col] + "\t");
                }
            }
            System.out.println();
        }
    }
}



