package nl.appie;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ShoppingTrolley {

    private ArrayList<Product> contentsOfTrolley;
    private Costumer costumer;
    private double totalOwed;
    private double totalDiscount;

    public ShoppingTrolley(Costumer costumer) {
        this.costumer = costumer;
        Store.addTrolley(this);
    }

    public void addProduct(Costumer costumer, Product product){
        for (ShoppingTrolley correctTrolley: Store.getShoppingTrolleys()) {
            if(correctTrolley.getCostumer().getCostumerID()==(costumer.getCostumerID())){
                correctTrolley.getContentsOfTrolley().add(product);
            }
        }
    }

    public void removeProduct(Costumer costumer, Product product){
        int index = 0;
        for (ShoppingTrolley correctTrolley: Store.getShoppingTrolleys()) {
            if(correctTrolley.getCostumer().getCostumerID()==(costumer.getCostumerID())){
                for (Product correctProduct: correctTrolley.getContentsOfTrolley()) {
                    if(correctProduct.equals(product)){
                        correctTrolley.getContentsOfTrolley().remove(index);
                    }
                }
            }
            index++;
        }
    }


    public ArrayList<Product> getContentsOfTrolley() {
        return contentsOfTrolley;
    }

    public void setContentsOfTrolley(ArrayList<Product> contentsOfTrolley) {
        this.contentsOfTrolley = contentsOfTrolley;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public double getTotalOwed() {
        return totalOwed;
    }

    public void setTotalOwed(double totalOwed) {
        this.totalOwed = totalOwed;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

}
