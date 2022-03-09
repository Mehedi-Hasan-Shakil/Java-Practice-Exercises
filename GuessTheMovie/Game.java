import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    String getRandomMovieName(ArrayList<String> movies) {
        Random generator = new Random();
        int index = (int) (generator.nextDouble() * movies.size());
        return movies.get(index);
    }

    ArrayList<String> getAllMoviesName(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        ArrayList<String> movies = new ArrayList<>();
        while (in.hasNextLine()) {
            movies.add(in.nextLine());
        }
        return movies;
    }

    char[] encryptMovieName(String movieName) {
        movieName = movieName.replaceAll("[a-zA-Z]", "_");
        return movieName.toCharArray();
    }

    char[] replaceTheCharacter(char singleCharacter, char[] movieName, char[] encryptedMovieName) {
        for (int i = 0; i < movieName.length; i++) {
            if (movieName[i] == singleCharacter) {

                encryptedMovieName[i] = singleCharacter;
            }
        }
        return encryptedMovieName;
    }
}
