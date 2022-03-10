import java.util.Arrays;
import java.util.Scanner;
/*Magic squares. An n × n matrix that is filled with the numbers
  1, 2, 3, . . ., n2 is a magic square if the sum of the elements in each row,
  in each column, and in the two diagonals is the same value.
  Write a program that reads in 16 values from the keyboard and tests
  whether they form a magic square when put into a 4 × 4 array.
  You need to test two features:
    1. Does each of the numbers 1, 2, ..., 16 occur in the user input?
    2. When the numbers are put into a square, are the sums of the rows, columns,
    and diagonals equal to each other?
 */

public class MagicSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int MATRIX_SIZE = 4;
        int[] array = new int[MATRIX_SIZE * MATRIX_SIZE];
        int[][] matrix = new int[MATRIX_SIZE][MATRIX_SIZE];
        int k = 0;
        boolean isMagicSquare = true;
        for (int i = 0; i < MATRIX_SIZE; i++)
            for (int j = 0; j < MATRIX_SIZE; j++) {
                matrix[i][j] = in.nextInt();
                array[k++] = matrix[i][j];
            }
        Arrays.sort(array); //sort array to check numbers from 1,2,3,---,n^2
        int tester = 1;
        for (int i : array) {
            if (i != tester) {
                isMagicSquare = false;
                break;
            }
            tester++;
        }
        if (isMagicSquare) {
            int sumAatLeftDiagonal = 0; //determine two diagonals
            for (int i = 0; i < 4; i++) {
                sumAatLeftDiagonal += matrix[i][i];
            }
            int sumAatRightDiagonal = 0;
            for (int i = 0; i < 4; i++) {
                sumAatRightDiagonal += matrix[i][3 - i];
            }
            if (sumAatLeftDiagonal == sumAatRightDiagonal) { //proceed if two diagonals are same
                for (int i = 0; i < 4; i++) {
                    int sumAtRow = 0;
                    for (int j = 0; j < 4; j++)
                        sumAtRow += matrix[i][j];
                    if (sumAtRow != sumAatLeftDiagonal) { //check each row
                        isMagicSquare = false;
                        break;
                    }

                }
                for (int i = 0; i < 4; i++) {
                    int sumAtColumn = 0;
                    for (int j = 0; j < 4; j++)
                        sumAtColumn += matrix[j][i];
                    if (sumAtColumn != sumAatLeftDiagonal) { //check each column
                        isMagicSquare = false;
                        break;
                    }
                }
            }
        }
        if (isMagicSquare) {
            System.out.println("WoW!!! It's a magic square");
        } else {
            System.out.println("It's not magic");
        }
    }
}
