import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindWordTester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String fileName = in.next();
        String anotherFileName = in.next();

        Find r1 = new Find("on", fileName);
        Find r2 = new Find("now", anotherFileName);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
