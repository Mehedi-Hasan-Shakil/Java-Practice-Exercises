import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/*Write a program that reads each line in a file, reverses its lines, and writes them to
  another file. For example, if the file input.txt contains the lines
    Mary had a little lamb
    Its fleece was white as snow
    And everywhere that Mary went
    The lamb was sure to go.
  and you run
  reverse input.txt output.txt
  then output.txt contains
    The lamb was sure to go.
    And everywhere that Mary went
    Its fleece was white as snow
    Mary had a little lamb
 */

public class ReverseAFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");
        ArrayList<String> lines = new ArrayList<>();
        while (in.hasNextLine()) {
            lines.add(in.nextLine());
        }
        for (int i = lines.size() - 1; i >= 0; i--) {
            out.println(lines.get(i));
        }
        in.close();
        out.close();
    }
}
