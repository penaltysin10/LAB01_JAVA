package exercise4;

import java.util.Arrays;

public class MasterMind {

    private int firstUser;
    private int secondUser;
    private boolean complete;
    private boolean canPlayGame;
    private int[] duplicate = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public MasterMind(int firstUser, int secondUser) {
        this.firstUser = firstUser;
        this.secondUser = secondUser;
        this.canPlayGame = true;
    }

    public void youCanPlayGame(){
        String num = Integer.toString(this.firstUser);
        for (int i = 0; i < num.length(); i++){
            int n = Integer.parseInt(Character.toString(num.charAt(i)));
            this.duplicate[n] += 1;
        }
        for (int number : duplicate){
            if (number > 1) this.canPlayGame = false;
        }
    }

    public String predictNum(){
        youCanPlayGame();
        if (this.canPlayGame == true){
            String numFirst = Integer.toString(this.firstUser);
            String numSecond = Integer.toString(this.secondUser);
            int digits = 0;
            int positions = 0;
            for (int i = 0; i < numFirst.length(); i++){
                if (numFirst.contains(Character.toString(numSecond.charAt(i)))){
                    digits += 1;
                    if (Character.toString(numFirst.charAt(i)).equals(Character.toString(numSecond.charAt(i)))){
                        positions += 1;
                    }
                }
            }
            if ((digits == 4) && (positions == 4)) return "Congratulations, you just mastered my mind!!";
            else return "Sorry, you not just mastered my mind!!";
        }
        return "You can't play game.";
    }

}
