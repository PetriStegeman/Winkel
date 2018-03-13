package nl.appie;

import java.util.ArrayList;

public class ShoppingTrolley {

    private ArrayList<Product> contentsOfTrolley;
    private Costumer costumer;

    public ShoppingTrolley(Costumer costumer) {
        this.costumer = costumer;
    }

    public void addProduct(Product myProduct){
        contentsOfTrolley.add(myProduct);
    }

    public void removeProduct (Product myProduct){
        contentsOfTrolley.remove(myProduct);
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
}
