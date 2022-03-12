import java.io.FileNotFoundException;

public class BankAccountTester {
    public static void main(String[] args) throws FileNotFoundException {
        WordCount wordCount = new WordCount("input.txt");
        WordCount wordCount1 = new WordCount("output.txt");
        Thread t1 = new Thread(wordCount);
        Thread t2 = new Thread(wordCount1);
        t1.run(); // I have faced difficulty to use start();
        t2.run();
        System.out.println("1 : " + wordCount.getNumberOfWords());
        System.out.println("2 : " + wordCount1.getNumberOfWords());
    }
}
