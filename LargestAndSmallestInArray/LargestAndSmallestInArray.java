import java.util.Scanner;
/*Modify the LargestInArray.java program in Section 7.3 to mark both the smallest and
  the largest elements.
*/

public class LargestAndSmallestInArray {
    public static void main(String[] args) {
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter values, Q to quit : ");
        while (in.hasNextDouble()) {
            values[currentSize] = in.nextDouble();
            currentSize++;
        }
        double maximum = values[0];
        double minimum = values[0];
        for (int i = 1; i < currentSize; i++) {
            if (values[i] > maximum) {
                maximum = values[i];
            }
            if (values[i] < minimum) {
                values[i] = minimum;
            }
        }
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i]);
            if (values[i] == maximum) {
                System.out.print(" <== largest value");
            }
            if (values[i] == minimum) {
                System.out.print(" <== smallest value");
            }
            System.out.println();
        }
    }
}
