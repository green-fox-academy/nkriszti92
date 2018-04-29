package week02.day01;

public class DrawChessTable {
    // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

    public static void main(String[] args) {
        int rows = 8;
        String row1 = "";
        String row2 = "";

        for (int j = 0; j < 4; j++) {
            row1 = row1 + "% ";
        }

        for (int k = 0; k < 4; k++) {
            row2 = row2 + " %";
        }


        for (int i = 0; i < rows; i++) {
            if (i % 2 == 1) {
                System.out.println(row1);


            }
            if (i % 2 == 0) {
                System.out.println(row2);
            }

        }
    }
}
