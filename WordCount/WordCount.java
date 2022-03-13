import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WordCount implements Runnable {
    private Scanner in;
    private int numberOfWords;
    private String fileName;

    public WordCount(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        in = new Scanner(new File(fileName));
    }

    @Override
    public void run() {
        while (in.hasNext()) {
            in.next();
            numberOfWords++;
        }
        System.out.println(fileName + " has " + numberOfWords + " words");
    }
}
