/*Write a method sumWithoutSmallest that computes the sum of an array of values,
  except for the smallest one, in a single loop. In the loop, update the sum and the
  smallest value. After the loop, return the difference.
*/
public class SumWithoutSmallest {
    public static void main(String[] args) {
        double[] values = {4, 5.6, 3, 6.8, 9};
        double result = sumWithoutSmallest(values);
        System.out.println("Sum without smallest value is " + result);
    }

    public static double sumWithoutSmallest(double[] values) {
        double sum = 0;
        double minimumValue = values[0];
        for (double d : values) {
            sum = sum + d;
            if (d < minimumValue) {
                minimumValue = d;
            }
        }
        return sum - minimumValue;
    }
}
