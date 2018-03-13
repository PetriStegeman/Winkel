package nl.appie;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private static List<Product> storeInventory;
    private static List<Costumer> costumerInStore;

    public static List<Product> getStoreInventory() {
        return storeInventory;
    }

    public static void setStoreInventory(List<Product> storeInventory) {
        Store.storeInventory = storeInventory;
    }

    public static List<Costumer> getCostumerInStore() {
        return costumerInStore;
    }

    public static void setCostumerInStore(List<Costumer> costumerInStore) {
        Store.costumerInStore = costumerInStore;
    }

    public void initAllLists() {
        storeInventory = new ArrayList<>();
        costumerInStore = new ArrayList<>();
    }


    public static void addProduct(Product product){
        storeInventory.add(Product product);
    }

    public static void removeProduct (Product product){
        storeInventory.remove(Product product);
    }

}
