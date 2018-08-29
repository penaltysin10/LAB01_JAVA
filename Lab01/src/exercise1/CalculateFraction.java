package exercise1;

public class CalculateFraction {

    private int numerator1;
    private int denominator1;
    private int numerator2;
    private int denominator2;
    private int ansNumerator;
    private int ansDenominator;

    public CalculateFraction(int numerator1, int denominator1, int numerator2, int denominator2){
        this.numerator1 = numerator1;
        this.denominator1 = denominator1;
        this.numerator2 = numerator2;
        this.denominator2 = denominator2;
    }

    public void calculator(){
        if (this.denominator1 == this.denominator2){
         this.ansNumerator = this.numerator1 + this.numerator2;
         this.ansDenominator = this.denominator1;
        }

        else {
            this.ansNumerator = (this.numerator1 * this.denominator2) + (this.numerator2 * this.denominator1);
            this.ansDenominator = this.denominator1 * this.denominator2;
        }
    }

    public String toString(){
        return String.format("Answers : %d/%d", this.ansNumerator, this.ansDenominator);
    }

}
