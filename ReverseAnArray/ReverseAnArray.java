/*Write a method that reverses the sequence of elements in an array
 */
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16, 8, 9, 7, 4, 9, 11};
        values = reverseAnArray(values);
        for (int i : values) {
            System.out.print(i + " ");
        }
    }

    public static int[] reverseAnArray(int[] values) {
        int temp;
        for (int i = 0; i < values.length / 2; i++) {
            temp = values[i];
            values[i] = values[values.length - 1 - i];
            values[values.length - 1 - i] = temp;
        }
        return values;
    }
}
