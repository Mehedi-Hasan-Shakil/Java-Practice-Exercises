import java.util.InputMismatchException;
import java.util.Scanner;
/*Write a program that asks the user to input a set of floating-point values. When the
  user enters a value that is not a number, give the user a second chance to enter the
  value. After two chances, quit reading input. Add all correctly specified values and
  print the sum when the user is done entering data. Use exception handling to detect
  improper inputs.
 */

public class NumberInputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int chances = 3;
        double sum = 0;
        System.out.println("Enter numbers : ");
        while (chances > 0) {
            try {
                sum = sum + in.nextDouble();
            } catch (InputMismatchException e) {
                chances--;
                if (!in.hasNextDouble()) {
                    System.out.println("You have " + chances + " chances left");
                    in.next();
                }
            }
        }
        System.out.println("Sum = " + sum);
        in.close();
    }
}
