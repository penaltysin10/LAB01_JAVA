package exercise5;

public class Player {

    private int life = 6;
    private int correctAlphabet = 0;
    private Hangman hangman;

    public Player(Hangman hangman) {
        this.hangman = hangman;
    }

    public void guessWords(String alphabet){
        if (this.hangman.checkAlphabetFromPlayer(alphabet)) this.correctAlphabet += 1;
        else this.life -= 1;
        System.out.println(this.hangman.statusGame(this.life, this.correctAlphabet));
    }

    public int checkLengthWords(){
        return this.hangman.lengthWords();
    }

    public int getLife() {
        return life;
    }

    public int getCorrectAlphabet() {
        return correctAlphabet;
    }
}
