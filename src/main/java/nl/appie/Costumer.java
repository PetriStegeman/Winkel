package nl.appie;

public class Costumer {

    private static int ccstumerIDCounter = 1;
    private int costumerID;
    private boolean hasPaid;

    public static void checkIn(){
        Costumer costumer = new Costumer(getCcstumerIDCounter()+ 1);
        setCcstumerIDCounter(getCcstumerIDCounter()+ 1);
        Store.addCostumer(costumer);
        ShoppingTrolley trolley = new ShoppingTrolley(costumer);
        Store.addTrolley(trolley);
    }

    public void checkOut(ShoppingTrolley shoppingTrolley){
        Store.removeTrolley(shoppingTrolley);
        Store.removeCostumer(shoppingTrolley.getCostumer());
    }

    public void getCorrectTrolley(ShoppingTrolley shoppingTrolley, Costumer costumer){

        for (ShoppingTrolley correctTrolley: Store.getShoppingTrolleys()) {
            if(correctTrolley.getCostumer() == costumer ){
                checkOut(correctTrolley);
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

    public static int getCcstumerIDCounter() {
        return ccstumerIDCounter;
    }

    public static void setCcstumerIDCounter(int ccstumerIDCounter) {
        Costumer.ccstumerIDCounter = ccstumerIDCounter;
    }
}
