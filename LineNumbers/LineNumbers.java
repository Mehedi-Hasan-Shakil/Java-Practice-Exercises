import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LineNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");
        int i = 1;
        while (in.hasNextLine()) {
            out.println("/*" + i + "*/ " + in.nextLine());
            i++;
        }
        in.close();
        out.close();

    }
}
