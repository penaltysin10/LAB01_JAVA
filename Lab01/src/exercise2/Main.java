package exercise2;

public class Main {
    public static void main(String[] args) {
        CalculateNumberOfStamps customerTest = new CalculateNumberOfStamps("C001");
        customerTest.addProduct(new Product("00", "test01", 100));
        customerTest.addProduct(new Product("01", "test01", 50));
        customerTest.addProduct(new Product("02", "test01", 150));
        customerTest.calculateStamps();
        System.out.println(customerTest.getNumOfStamps());
        customerTest.removeProduct("01");
        customerTest.calculateStamps();
        System.out.println(customerTest.getNumOfStamps());
    }
}
