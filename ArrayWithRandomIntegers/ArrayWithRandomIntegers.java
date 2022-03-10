import java.util.Random;
/*Write a program that initializes an array with ten random integers and then prints
  four lines of output, containing
    • Every element at an even index.
    • Every even element.
    • All elements in reverse order.
    • Only the first and last element.
*/

public class ArrayWithRandomIntegers {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;
        Random generator = new Random();
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = generator.nextInt(Integer.MAX_VALUE);
        }
        for (int i = 0; i < ARRAY_SIZE; i = i + 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = ARRAY_SIZE - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(array[0] + " " + array[ARRAY_SIZE - 1]);
    }
}
