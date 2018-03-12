package nl.appie;

import java.util.ArrayList;

public class Store {

    ArrayList<Product> storeInventory;


    //Moet alternatief voor bedenken
    public static Store myStore(){
        ArrayList<Product> storeContents = new ArrayList<Product>();

        Product frikandelBroodje = new Product("Frikandel Broodje", 1.00);
        Product pampers = new Product("Pampers", 9.99);
        Product chickenFilet = new Product("Kip Filet", 2.40);
        Product iceTea = new Product("Ijsthee", 0.99);

        storeContents.add(frikandelBroodje);
        storeContents.add(pampers);
        storeContents.add(chickenFilet);
        storeContents.add(iceTea);

        return new Store(ArrayList<Product> storeContents);
    }

    public void addProduct(Product product){
        storeInventory.add(Product product);
    }

    public void removeProduct (Product product){
        storeInventory.remove(Product product);
    }

}
