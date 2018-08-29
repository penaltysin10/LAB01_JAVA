package exercise3;

public class Player { // add object player for play guessNumber
    private GuessNumber number;

    public Player(GuessNumber num){
        this.number = num;
    }

    public String guessNum(int num){
        return number.CheckNum(num);
    }
}
