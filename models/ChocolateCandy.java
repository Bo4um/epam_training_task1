package models;

public class ChocolateCandy extends Sweets{
    public ChocolateCandy(){
        super("Chocolate candy");
    }

    // the price increased because of the nut filling
    public final double getPrice(){
        return this.getWeight() * this.getPricePerKilogram() + 6;
    }
}
