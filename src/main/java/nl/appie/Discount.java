package nl.appie;

import java.util.ArrayList;
import java.util.Calendar;

public class Discount {

    private double precentageDiscount;  // 1.00 voor volle prijs, 0.50 voor 50% korting etc, dus 1 als deze korting niet geld.
    private int[] day;                  //Array met de dagen van de week dat deze korting geldig is, dus leeg als deze korting niet geld.
    private Product discountedProduct;  //Het product object waar de korting voor geld
    private int nummerVoorPrijsVanEen;   //Hoeveel je voor de prijs van 1 krijgt, dus 1 als deze korting niet geld.


    //Methode die de korting van een product berekent op basis van percentage korting op een bepaalde dag
    public double discountPricePercentage(ShoppingTrolley myTrolley){
        double totalDiscount = 0.00;
        for(int i = 0; i < this.day.length; i++ ){
            if(this.day[i]==Calendar.DAY_OF_WEEK){
                for (Product product:myTrolley.getContentsOfTrolley()) {
                    if(product.equals(this.discountedProduct)){
                        totalDiscount = product.getPrice()+product.getPrice()*this.precentageDiscount;
                    }
                }
                break;
            }
        }
        myTrolley.setTotalDiscount(myTrolley.getTotalDiscount()+totalDiscount);
        return totalDiscount;
    }

    //Methodie die de korting van een product berekent op basis van meerdere producten voor de prijs van 1
    public double discountPriceVoorPrijsVanEen(ShoppingTrolley myTrolley) {
        double totalDiscount = 0.00;
        int item = 0;
        for(int i = 0; i < this.day.length; i++ ){
            if(this.day[i]==Calendar.DAY_OF_WEEK){
                for (Product product:myTrolley.getContentsOfTrolley()) {
                    if(product.equals(this.discountedProduct)){
                            item++;
                    }
                }
                break;
            }
        }
        totalDiscount = (item - item % this.nummerVoorPrijsVanEen) / this.nummerVoorPrijsVanEen;
        myTrolley.setTotalDiscount(myTrolley.getTotalDiscount()+totalDiscount);
        return totalDiscount;

    }

    public Product getDiscountedProduct() {
        return discountedProduct;
    }

    public void setDiscountedProduct(Product discountedProduct) {
        this.discountedProduct = discountedProduct;
    }

    public double getPrecentageDiscount() {
        return precentageDiscount;
    }

    public void setPrecentageDiscount(double precentageDiscount) {
        this.precentageDiscount = precentageDiscount;
    }

    public int[] getDay() {
        return day;
    }

    public void setDay(int[] day) {
        this.day = day;
    }

    public int getNummerVoorPrijsVanEen() {
        return nummerVoorPrijsVanEen;
    }

    public void setNummerVoorPrijsVanEen(int nummerVoorPrijsVan1) {
        this.nummerVoorPrijsVanEen = nummerVoorPrijsVan1;
    }
}
