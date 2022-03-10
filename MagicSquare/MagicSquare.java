public class MagicSquare {
    public static void main(String[] args) {
        final int squareSize = 5;
        int[][] magicSquare = new int[squareSize][squareSize];
        int row = 0;                 //Always start from first row and
        int column = squareSize / 2; //central column
        for (int value = 1; value <= squareSize * squareSize; value++) {
            magicSquare[row][column] = value;
            if (value % squareSize == 0) { //when value is multiple of squareSize
                row = row + 1;             //update row by 1
            } else {
                row = row - 1;             //decrease row and column when value
                column = column - 1;       //is non-multiple
            }
            if (row < 0) {                 //Update the invalid index by squareSize
                row = row + squareSize;
            }
            if (column < 0) {
                column = column + squareSize;
            }
        }
        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++)
                System.out.print(magicSquare[i][j] + " ");
            System.out.println();
        }
    }
}
