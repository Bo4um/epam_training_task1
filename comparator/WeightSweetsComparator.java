package comparator;

import java.util.Comparator;

import models.Sweets;

// this class compare two Sweets-objects by weight
public class WeightSweetsComparator implements Comparator<Sweets>{
    @Override
    public int compare(Sweets s1, Sweets s2){
        return Double.compare(s1.getWeight(), s2.getWeight());
    }
}