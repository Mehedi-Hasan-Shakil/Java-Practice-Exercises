import java.util.Scanner;
/*Implement the following algorithm to construct magic n × n squares; it works only if
  n is odd.
    Set row = n - 1, column = n / 2.
    For k = 1 ... n * n
    Place k at [row][column].
    Increment row and column.
    If the row or column is n, replace it with 0.
    If the element at [row][column] has already been filled
    Set row and column to their previous values.
    Decrement row.
 */

public class MagicSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter matrix size : ");
        int matrixSize = in.nextInt();
        int[][] matrix = new int[matrixSize][matrixSize];
        int k = 1;
        int row = matrixSize - 1;
        int column = matrixSize / 2;
        for (int i = 1; i <= matrixSize * matrixSize; i++) {
            matrix[row][column] = i;
            int tempRow = row;
            int tempColumn = column;
            row++;
            column++;
            if (row == matrixSize) {
                row = 0;
            }
            if (column == matrixSize) {
                column = 0;
            }
            if (matrix[row][column] > 0) {
                row = tempRow;
                column = tempColumn;
                row--;
            }
        }
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
