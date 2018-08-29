package exercise5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hangman hangman1 = new Hangman("America");
        Player test = new Player(hangman1);
        test.guessWords("m");
        test.guessWords("a");
        test.guessWords("A");
        test.guessWords("e");
        test.guessWords("r");
        test.guessWords("i");
        test.guessWords("c");



    }
}
