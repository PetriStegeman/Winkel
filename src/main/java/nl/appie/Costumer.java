package nl.appie;

public class Costumer {

    //CUSTOMER BTW

    private static int costumerIDCounter = 1;
    private int costumerID;
    //private double paysWithMoney;


    /*
     * checkIn maakt nieuwe Costumer, voegt deze toe aan de lijst van Costumers die in de winkel zijn (lijst Costumers in Store)
     *         maakt nieuwe ShoppingTrolley, voegt deze toe aan de lijst van ShoppingTrolleys die in de winkel zijn (lijst ShoppingTrolleys in Store)
     */
    public static void checkIn(){
        Costumer costumer = new Costumer(getCostumerIDCounter());
        setCostumerIDCounter(getCostumerIDCounter()+ 1);
        Store.addCostumer(costumer);
        ShoppingTrolley trolley = new ShoppingTrolley(costumer);
        Store.addTrolley(trolley);
    }

    /*
     * checkOut haalt het juiste ShoppingTrolley object uit de lijst van ShoppingTrolley in Store
     *          haalt het juiste Costumer object uit de lijst van Costumer in Store
     */
    public void checkOut(Costumer costumer){
        for (ShoppingTrolley correctTrolley: Store.getShoppingTrolleys()) {
            if(correctTrolley.getCostumer() == costumer ){
                Store.removeTrolley(correctTrolley);
            }
        }
        for (Costumer correctCostumer: Store.getCostumerInStore()) {
            if(correctCostumer.getCostumerID() == costumer.getCostumerID() ){
                Store.removeCostumer(correctCostumer);
            }
        }



    }

    public Costumer(int costumerID) {
        this.costumerID = costumerID;
    }

    public int getCostumerID() {
        return costumerID;
    }

    public void setCostumerID(int costumerID) {
        this.costumerID = costumerID;
    }

    public static int getCostumerIDCounter() {
        return costumerIDCounter;
    }

    public static void setCostumerIDCounter(int ccstumerIDCounter) {
        Costumer.costumerIDCounter = ccstumerIDCounter;
    }

    public double getPaysWithMoney() {
        return paysWithMoney;
    }

    public void setPaysWithMoney(double paysWithMoney) {
        this.paysWithMoney = paysWithMoney;
    }
}
