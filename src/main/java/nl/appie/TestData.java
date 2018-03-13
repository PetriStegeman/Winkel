package nl.appie;

public class TestData {

   public static void generateData(){
       Store myStore = new Store();
       myStore.initAllLists();
       productList();

   }

    public static void productList(){
        Product frikandelBroodje = new Product("Frikandel Broodje", 1.00, true);
        Product pampers = new Product("Pampers", 9.99, true);
        Product chickenFilet = new Product("Kip Filet", 2.40, true);
        Product iceTea = new Product("Ijsthee", 0.99, true);

        Store.addProduct(frikandelBroodje);
        Store.addProduct(pampers);
        Store.addProduct(chickenFilet);
        Store.addProduct(iceTea);
    }

}
