import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Find implements Runnable {
    private Scanner in;
    String fileName;
    private String word;

    public Find(String word, String fileName) throws FileNotFoundException {
        in = new Scanner(new File(fileName));
        this.word = word;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line.contains(word)) {
                System.out.println(fileName + " " + line);
            }
        }
    }
}
