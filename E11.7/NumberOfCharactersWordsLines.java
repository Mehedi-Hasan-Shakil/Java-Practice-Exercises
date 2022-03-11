import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberOfCharactersWordsLines {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));
        int numberOfLines = 0;
        int numberOfCharacters = 0;
        int numberOfWords = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] words = line.split(" ");
            for (String s : words) {
                numberOfCharacters += s.length();
            }
            numberOfWords += words.length;
            numberOfLines++;
        }


        System.out.println("Number Of character = " + numberOfCharacters);
        System.out.println("Number Of words = " + numberOfWords);
        System.out.println("Number Of lines = " + numberOfLines);
        in.close();
    }
}
