package exercise6;

import java.util.ArrayList;

public class MonsterBallList {

    private ArrayList<MonsterBall> monsterBalls = new ArrayList<>();

    public void addMonsterBall(MonsterBall monsterBall){
        this.monsterBalls.add(monsterBall);
    }

    public void removeMonsterBall(MonsterBall monsterBall){
        this.monsterBalls.remove(monsterBall);
    }

    public void countMonsterBall(){
        this.monsterBalls.size();
    }

    public void detailMonsterBall(){
        for (MonsterBall monsterBall : monsterBalls){
            System.out.printf("Monster Ball Type: %s | Price: %s | Sell for: %s | Ball Value: %s"
                    ,monsterBall.getBallType(), monsterBall.getPrice(), monsterBall.getPrice()
                    , monsterBall.getSell(), monsterBall.getBallValue());
        }
    }
}
