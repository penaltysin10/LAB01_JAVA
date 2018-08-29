package exercise2;

import java.util.ArrayList;

public class CalculateNumberOfStamps {
    private String customerID;
    private ArrayList<Product> products;
    private int numOfStamps;

    public CalculateNumberOfStamps(String customerID) {
        this.customerID = customerID;
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void removeProduct(String productID){   // In uml get input as Object, but I'm change input from object to string.
        for (Product product : products){
            if (product.getProductID().equals(productID)){
                this.products.remove(product);
            }
        }
    }

    public void calculateStamps(){
        int customerSpent = 50;
        double totalPrices = 0;
        for (Product product : this.products){
            totalPrices += product.getPrice();
        }
        this.numOfStamps = (int) (totalPrices / customerSpent);
    }

    public String getNumOfStamps() {
        return String.format("You have %d stamp.", this.numOfStamps);
    }
}
