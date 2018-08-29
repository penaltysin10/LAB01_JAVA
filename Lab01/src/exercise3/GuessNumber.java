package exercise3;

import java.util.Random;

public class GuessNumber {
    private int target;

    public GuessNumber(){}

    public void setTarget(){
        Random random = new Random();
        this.target = random.nextInt(100) + 1;
    }

    public int getTarget() {
        return target;
    }

    public String CheckNum(int num){ // change method from guessNum, this method check value received from player is match the target
        // then return string show value is high, low or match target.
        if (num < this.target){return String.format("The number is too low, try again.");}
        else if (num > this.target){return String.format("The number is too high, try again.");}
        return String.format("Congratulations the target is %d", getTarget());
    }
}
