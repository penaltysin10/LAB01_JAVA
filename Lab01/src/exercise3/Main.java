package exercise3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        GuessNumber number = new GuessNumber();
        number.setTarget();
        System.out.println("Target is " + number.getTarget());
        Player playerTest = new Player(number);
        System.out.println(playerTest.guessNum(3));
        System.out.println(playerTest.guessNum(50));
        System.out.println(playerTest.guessNum(20));
        System.out.println(playerTest.guessNum(10));
        System.out.println(playerTest.guessNum(1));
        System.out.println(playerTest.guessNum(4));

    }
}
