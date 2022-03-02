package models;

public class ChocolateCookies extends Sweets{
    public ChocolateCookies(){
        super("Chocolate cookies");
    }

    // the price increased because of the chocolate filling
    public final double getPrice(){
        return this.getWeight() * this.getPricePerKilogram() + 5;
    }
}
