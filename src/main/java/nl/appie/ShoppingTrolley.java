package nl.appie;

import java.util.ArrayList;

public class ShoppingTrolley {

    ArrayList<Product> contentsOfTrolley;

    public void addProduct(Product product){
        contentsOfTrolley.add(Product product);
    }

    public void removeProduct (Product product){
        contentsOfTrolley.remove(Product product);
    }

}
