import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessTheMovie {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("movies.txt");
        Game game = new Game();
        Scanner in = new Scanner(file);
        Scanner inputCharacter = new Scanner(System.in);
        int wrongCounter = 0;
        ArrayList<String> movies = game.getAllMoviesName(file);
        String movieName = game.getRandomMovieName(movies);
        char[] encryptedMovieName = game.encryptMovieName(movieName);
        System.out.print("You are guessing : ");
        System.out.println(encryptedMovieName);
        //System.out.println(encryptedMovieName);
        while (wrongCounter < 10) {
            System.out.print("Guess a letter : ");
            char singleCharacter = inputCharacter.next().charAt(0);

            if (movieName.toString().contains(singleCharacter + "")) {
                encryptedMovieName = game.replaceTheCharacter(singleCharacter, movieName.toCharArray(), encryptedMovieName);
            } else {
                wrongCounter++;
            }
            System.out.println("You have guessed (" + wrongCounter + ") wrong letters:");
            System.out.print("You are guessing : ");
            System.out.println(encryptedMovieName);
            if (!(new String(encryptedMovieName).contains("_"))) {
                System.out.println("Congratulation!!! You have won the game");
                break;
            }
        }
        if (wrongCounter >= 10) {
            System.out.println("You have failed to guess the movie.");
            System.out.println("The name of the movie was : " + movieName);
        }
    }
}
