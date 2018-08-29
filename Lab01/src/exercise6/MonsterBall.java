package exercise6;

public class MonsterBall {
    private String ballType;
    private String price;
    private String sell;
    private String ballValue;

    public MonsterBall(String ballType, String price, String sell, String ballValue) {
        this.ballType = ballType;
        this.price = price;
        this.sell = sell;
        this.ballValue = ballValue;
    }

    public String getBallType() {
        return ballType;
    }

    public String getPrice() {
        return price;
    }

    public String getSell() {
        return sell;
    }

    public String getBallValue() {
        return ballValue;
    }


}
