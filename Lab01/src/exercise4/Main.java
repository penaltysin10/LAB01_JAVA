package exercise4;

public class Main {
    public static void main(String[] args) {
        MasterMind masterMind = new MasterMind(1000, 1234);
        System.out.println(masterMind.predictNum());
        MasterMind masterMind1 = new MasterMind(2018, 2018);
        System.out.println(masterMind1.predictNum());
    }
}
