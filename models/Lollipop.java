package models;

public class Lollipop extends Sweets{
    public Lollipop(){
        super("Lollipop");
    }

    // the price increased because of the wand
    public final double getPrice(){
        return this.getWeight() * this.getPricePerKilogram() + 3;
    }
}
