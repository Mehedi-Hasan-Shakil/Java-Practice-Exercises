import java.util.Random;
/*Write a program that generates a sequence of 20 random die tosses in an array and
that prints the die values, marking only the longest run, like this:
1 2 5 5 3 1 2 4 3 (2 2 2 2) 3 6 5 5 6 3 1
If there is more than one run of maximum length, mark the first one.
 */

public class DieTossLongestSequence {
    public static void main(String[] args) {
        final int TOSS = 20;
        int[] dieToss = new int[TOSS];
        Random generator = new Random();
        for (int i = 0; i < TOSS; i++) {
            dieToss[i] = generator.nextInt(6) + 1;
        }
        int counter = 0;
        int longestSequence = 0;
        int start = 0;
        int end = 0;
        int longestSequenceStartPosition = 0;
        int longestSequenceEndPosition = 0;
        boolean startPosition = true;
        for (int i = 0; i < dieToss.length - 1; i++) {
            if (dieToss[i] == dieToss[i + 1]) {
                if (startPosition) {
                    start = i;
                    startPosition = false;
                }
                end = i + 1;
                counter++;

            } else {
                startPosition = true;
                if (counter > longestSequence) {
                    longestSequence = counter;
                    longestSequenceStartPosition = start;
                    longestSequenceEndPosition = end;
                }
                counter = 0;
            }
        }
        for (int i = 0; i < dieToss.length; i++) {
            if (i == longestSequenceStartPosition && longestSequenceEndPosition > 0) {
                System.out.print("( ");
            }
            System.out.print(dieToss[i] + " ");
            if (i == longestSequenceEndPosition && i > 0) {
                System.out.print(") ");
            }

        }
    }
}
