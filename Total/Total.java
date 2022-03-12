import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/*How can you modify the Total program so that it writes the values in two
  columns, like this:
  32.00  54.00
  67.50  29.00
  35.00  80.00
 115.00  44.50
 100.00  65.00
Total:  622.00
 */

public class Total {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");
        double total = 0;
        int lineCounter = 1;
        while (in.hasNextDouble()) {
            double value = in.nextDouble();
            out.printf("%8.2f ", value);
            if (lineCounter % 2 == 0)
                out.println();
            total += value;
            lineCounter++;
        }
        if (lineCounter % 2 == 0)
            out.println();
        out.printf("Total: %10.2f\n", total);
        in.close();
        out.close();
    }
}
