import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DoubleAverage {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner name = new Scanner(System.in);
        String inputFileName = name.next();
        Scanner in = new Scanner(new File(inputFileName));
        double totalAtFirstColumn = 0, totalAtSecondColumn = 0;
        int count = 0;
        while (in.hasNextDouble()) {
            totalAtFirstColumn += in.nextDouble();
            totalAtSecondColumn += in.nextDouble();
            count++;
        }
        System.out.println("Average at first column is " + totalAtFirstColumn / count);
        System.out.println("Average at second column is " + totalAtSecondColumn / count);
    }
}
