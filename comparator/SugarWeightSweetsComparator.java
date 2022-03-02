package comparator;

import java.util.Comparator;

import models.Sweets;

// this class compare two Sweets-objects by sugar weight
public class SugarWeightSweetsComparator implements Comparator<Sweets>{
    @Override
    public int compare(Sweets s1, Sweets s2){
        return Double.compare(s1.getSugarWeight(), s2.getSugarWeight());
    }
}
