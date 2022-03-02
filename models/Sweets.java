package models;

public abstract class Sweets{

    private String type;
    private double weight;
    private double sugarWeight;
    private double pricePerKilogram;

    public Sweets(String type){
        this.type = type;
    }

    public final String getType(){
        return this.type;
    }

    public final void setWeight(double weight){
        this.weight = weight;
    }

    public final double getWeight(){
        return this.weight;
    }

    public final double getPricePerKilogram(){
        return this.pricePerKilogram;
    }

    public final void setPricePerKilogram(double pricePerKilogram){
        this.pricePerKilogram = pricePerKilogram;
    }

    public final void setSugarWeight(double sugarWeight){
        this.sugarWeight = sugarWeight;
    }

    public final double getSugarWeight(){
        return this.sugarWeight;
    }

    abstract public double getPrice();

    public final String toString(){
        return this.type
            + "; weight: " + this.weight 
            + "; sugar weight: " + this.sugarWeight 
            + "; price per kilogram: " + this.pricePerKilogram;
    }
}
