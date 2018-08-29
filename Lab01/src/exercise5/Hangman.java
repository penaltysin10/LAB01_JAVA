package exercise5;

public class Hangman {

    private String words;

    public Hangman(String words){
        this.words = words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public boolean checkAlphabetFromPlayer(String alphabet){
        if (this.words.contains(alphabet)) return true;
        return false;
    }

    public int lengthWords(){
        return this.words.length();
    }

    public String statusGame(int life, int correctNumAlphabet){
        if ((life != 0) && (correctNumAlphabet == this.words.length())) return String.format("Words is %s, You win!", this.words);
        else if ((life != 0) && (correctNumAlphabet != this.words.length())) return "try again!";
        else return "GAME OVER!";
    }
}
