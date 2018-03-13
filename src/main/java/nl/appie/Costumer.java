package nl.appie;

public class Costumer {

    private int customerID;
    private boolean hasPaid;

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

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
