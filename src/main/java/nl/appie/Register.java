package nl.appie;

import java.util.ArrayList;

public class Register {

    private double moneyOffered;
    private double totalOwed;
    private double change;

    public double totalOwed(ShoppingTrolley myTrolley){
        for (ShoppingTrolley items: myTrolley) {
            
        }
        myTrolley.get()
    }

    public double whatIsChange(double moneyOffered, double totalOwed, double discount) {
        double change = moneyOffered - totalOwed - discount;
        return change;
    }

}
