import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WordCount extends Thread {
    private String fileName;
    private int numberOfWords;

    public WordCount(String fileName) {
        this.fileName = fileName;
        numberOfWords = 0;
    }

    @Override
    public void run() {
        try (Scanner in = new Scanner(new File(fileName));) {
            while (in.hasNext()) {
                String word = in.next();
                numberOfWords++;
            }
        } catch (FileNotFoundException e) {
        } catch (InputMismatchException e) {
        }
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }
}
