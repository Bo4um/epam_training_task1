package search;

import java.util.ArrayList;
import java.util.List;

import models.Sweets;

public class SearchInTheSugarDiopazone implements Search{
    List<Sweets> sweets;

    public SearchInTheSugarDiopazone(List<Sweets> sweets){
        this.sweets = sweets;
    }
    @Override
    public List<Sweets> search(double from, double before) {
        List<Sweets> resultSweets = new ArrayList<>();
        for (Sweets sweet: this.sweets){
            if(sweet.getSugarWeight() >= from && sweet.getSugarWeight() <= before){
                resultSweets.add(sweet);
            }
        }
        return resultSweets;
    }
}
