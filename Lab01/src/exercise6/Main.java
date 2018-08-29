package exercise6;

public class Main {
    public static void main(String[] args) {
        MonsterBallList monsterBallList = new MonsterBallList();
        MonsterBall pokeBall = new MonsterBall("Poke Ball", "200", "100", "1");
        monsterBallList.addMonsterBall(pokeBall);
        monsterBallList.detailMonsterBall();
    }
}
