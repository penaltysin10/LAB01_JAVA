package exercise1;

public class Main {
    public static void main(String args[]){
        CalculateFraction fraction = new CalculateFraction(1, 3, 2, 5);
        fraction.calculator();
        System.out.println(fraction.toString());
    }
}
