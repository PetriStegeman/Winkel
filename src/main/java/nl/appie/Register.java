package nl.appie;

import java.util.ArrayList;

public class Register {

    public void totalOwed(ShoppingTrolley myTrolley){
        private double totalOwed = 0.00;
        for (Product items: myTrolley.getContentsOfTrolley()) {
            totalOwed += items.getPrice();
        }
        System.out.println("Het totaal verschuldigde bedrag is " + totalOwed + "euro");
        whatIsChange(totalOwed);
    }

    public void whatIsChange(double moneyOffered, double totalOwed, double discount) {
        double change = moneyOffered - totalOwed - discount;
        System.out.println("Uw totale korting bedraagt " + discount + "euro");
        System.out.println("Uw totale wisselgeld bedraagt " + change + "euro");
    }

    public void getCorrectTrolley(ShoppingTrolley shoppingTrolley, Costumer costumer){
        for (ShoppingTrolley correctTrolley: Store.getShoppingTrolleys()) {
            if(correctTrolley.getCostumer() == costumer){
                totalOwed(correctTrolley);
            }
        }
    }
}
