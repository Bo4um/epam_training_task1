package models;

public class Waffles extends Sweets{
    public Waffles(){
        super("Waffles");
    }

    public final double getPrice(){
        return this.getWeight() * this.getPricePerKilogram();
    }
}
