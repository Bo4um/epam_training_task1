package controller;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import comparator.PricePerKilogramSweetsComparator;
import comparator.PriceSweetsComparator;
import comparator.SugarWeightSweetsComparator;
import comparator.WeightSweetsComparator;
import models.Sweets;
import models.Lollipop;
import models.Waffles;
import models.ChocolateCandy;
import models.ChocolateCookies;
import search.Search;
import search.SearchInTheSugarDiopazone;

// main class-controller
public class App {
    static NumberFormat formatter = new DecimalFormat("#0.00");
    public static void main(String[] args) throws Exception {
        // creating the sweets
        Sweets lollipop = new Lollipop();
        lollipop.setWeight(1.2);
        lollipop.setSugarWeight(0.6);
        lollipop.setPricePerKilogram(4.6);

        Sweets chocolateCookies = new ChocolateCookies();
        chocolateCookies.setWeight(1.0);
        chocolateCookies.setSugarWeight(0.5);
        chocolateCookies.setPricePerKilogram(6.8);

        Sweets waffle = new Waffles();
        waffle.setWeight(2.2);
        waffle.setSugarWeight(0.4);
        waffle.setPricePerKilogram(5.3);

        Sweets chocolateCandy = new ChocolateCandy();
        chocolateCandy.setWeight(2.5);
        chocolateCandy.setSugarWeight(0.8);
        chocolateCandy.setPricePerKilogram(7.4);

        List<Sweets> present = new ArrayList<>();
        present.add(lollipop);
        present.add(chocolateCookies);
        present.add(waffle);
        present.add(chocolateCandy);

        double totalWeight = 0;
        double totalPrice = 0;
        for(Sweets sweet: present){
            totalWeight += sweet.getWeight();
            totalPrice += sweet.getPrice();
        }

        // printing an info of the present
        System.out.println("The present contains: " 
                            + lollipop.getType() + ", "
                            + chocolateCookies.getType() + ", "
                            + waffle.getType() + ", "
                            + chocolateCandy.getType()); 
        System.out.println("Its weight is " + totalWeight);
        System.out.println("It costs " + formatter.format(totalPrice));
        System.out.println("========================================");
       
        // present sorted by a weight
        present.sort(new WeightSweetsComparator());   
        System.out.println("Present sorted by a weight: ");
        for(Sweets sweet: present){
            System.out.println(sweet.getType() + " => " + sweet.getWeight());
        }      
        System.out.println("========================================");        
        
        // present sorted by a price
        present.sort(new PriceSweetsComparator());   
        System.out.println("Present sorted by a price: ");
        for(Sweets sweet: present){
            System.out.println(sweet.getType() + " => " + sweet.getPrice());
        } 
        System.out.println("========================================");

        // present sorted by a price per kilogram
        present.sort(new PricePerKilogramSweetsComparator());   
        System.out.println("Present sorted by a price per kilogram: ");
        for(Sweets sweet: present){
            System.out.println(sweet.getType() + " => " + sweet.getPricePerKilogram());
        } 
        System.out.println("========================================");

        // present sorted by a sugar weight
        present.sort(new SugarWeightSweetsComparator());   
        System.out.println("Present sorted by a sugar weight: ");
        for(Sweets sweet: present){
            System.out.println(sweet.getType() + " => " + sweet.getSugarWeight());
        } 
        System.out.println("========================================");

        // printing a list of sweets that contain sugar in the diopazone from 0.5 before 0.7
        Search searchBySugar = new SearchInTheSugarDiopazone(present);
        List<Sweets> diopazoneSweets = searchBySugar.search(0.5, 0.7);
        System.out.println("Sweets that contain sugar in the diopazone from 0.5 before 0.7: ");
        for(Sweets sweet: diopazoneSweets){
            System.out.println(sweet.getType() + " => " + sweet.getSugarWeight());
        }
    }
}
