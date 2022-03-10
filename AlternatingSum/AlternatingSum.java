/*Compute the alternating sum of all elements in an array.
 */
public class AlternatingSum {
    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0) {
                sum = sum + values[i];
            } else {
                sum = sum - values[i];
            }
        }
        System.out.println("The alternating sum is " + sum);
    }
}
