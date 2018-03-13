package nl.appie;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private static List<Product> storeInventory;
    private static List<Costumer> costumerInStore;
    private static List<ShoppingTrolley> shoppingTrolleys;

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

    public static List<ShoppingTrolley> getShoppingTrolleys() {
        return shoppingTrolleys;
    }

    public static void setShoppingTrolleys(List<ShoppingTrolley> shoppingTrolleys) {
        Store.shoppingTrolleys = shoppingTrolleys;
    }

    public void initAllLists() {
        storeInventory = new ArrayList<>();
        costumerInStore = new ArrayList<>();
        shoppingTrolleys = new ArrayList<>();
    }


    public static void addProduct(Product product) {
        storeInventory.add(product);
    }

    public static void removeProduct(Product product) {
        storeInventory.remove(product);
    }

    public static void addTrolley(ShoppingTrolley shoppingTrolley) {
        shoppingTrolleys.add(shoppingTrolley);
    }

    public static void removeTrolley(ShoppingTrolley shoppingTrolley) {
        shoppingTrolleys.remove(shoppingTrolley);
    }

    public static void addCostumer(Costumer costumer) {
        costumerInStore.add(costumer);
    }

    public static void removeCostumer(Costumer costumer) {
        costumerInStore.remove(costumer);
    }
}
