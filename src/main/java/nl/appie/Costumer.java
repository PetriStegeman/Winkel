package nl.appie;

public class Costumer {

    //CUSTOMER BTW

    private static int costumerIDCounter = 1;
    private int costumerID;
    private double paysWithMoney;

    public static void checkIn(){
        Costumer costumer = new Costumer(getCostumerIDCounter()+ 1);
        setCostumerIDCounter(getCostumerIDCounter()+ 1);
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
