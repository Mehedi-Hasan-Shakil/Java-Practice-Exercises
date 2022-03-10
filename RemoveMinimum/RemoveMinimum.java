/*Add a method removeMin to the Student class of Section 7.4 that removes the minimum
  score without calling other methods.
*/
public class RemoveMinimum {
    public static void main(String[] args) {
        double[] values = {5, 6.7, 8, 4, 9.3, 22.6, 8.7, 6};
        double[] newValues = new double[values.length - 1];
        values = removeMinimum(values);
        for (int i = 0; i < values.length - 1; i++) {
            newValues[i] = values[i];
        }
        for (double d : newValues) {
            System.out.print(d + " ");
        }
    }

    public static double[] removeMinimum(double[] values) {
        double minimum = values[0];
        int minimumPosition = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] < minimum) {
                minimum = values[i];
                minimumPosition = i;
            }
        }
        for (int i = minimumPosition; i < values.length - 1; i++) {
            values[i] = values[i + 1];
        }
        return values;
    }
}
