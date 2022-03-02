package comparator;

import java.util.Comparator;

import models.Sweets;

// this class compare two Sweets-objects by price per kilogram
public class PricePerKilogramSweetsComparator implements Comparator<Sweets>{
    @Override
    public int compare(Sweets s1, Sweets s2){
        return Double.compare(s1.getPricePerKilogram(), s2.getPricePerKilogram());
    }
}
