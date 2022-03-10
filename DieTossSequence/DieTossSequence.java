import java.util.Random;
/*A run is a sequence of adjacent repeated values. Write a program that generates a
sequence of 20 random die tosses in an array and that prints the die values, marking
the runs by including them in parentheses, like this:
1 2 (5 5) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1
 */

public class DieTossSequence {
    public static void main(String[] args) {
        final int TOSS = 20;
        int[] dieToss = new int[TOSS];
        Random generator = new Random();
        for (int i = 0; i < TOSS; i++) {
            dieToss[i] = generator.nextInt(6) + 1;
        }
        for (int i : dieToss) {
            System.out.print(i + " ");
        }
        System.out.println();
        boolean sequence = false;
        for (int i = 0; i < dieToss.length - 1; i++) {
            if (dieToss[i] == dieToss[i + 1] && !sequence) {
                System.out.print("( " + dieToss[i] + " ");
                sequence = true;
            } else {
                System.out.print(dieToss[i] + " ");

                if (dieToss[i] != dieToss[i + 1] && sequence) {
                    System.out.print(") ");
                    sequence = false;
                }

            }
            if (sequence && i == dieToss.length - 2) {   //To check the last element
                System.out.print(dieToss[i + 1] + " )");
            }
            if (i == dieToss.length - 2 && !sequence) {  //To check the last element
                System.out.println(dieToss[i + 1]);
            }
        }
    }
}
