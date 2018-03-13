package nl.appie;


public class Register {

    public void totalOwed(ShoppingTrolley myTrolley){
        double totalOwed = 0.00;
        for (Product items: myTrolley.getContentsOfTrolley()) {
            totalOwed += items.getPrice();
        }
        System.out.println("Het totaal verschuldigde bedrag is " + totalOwed + "euro");
        myTrolley.setTotalOwed(totalOwed);
    }

    public void whatIsChange(ShoppingTrolley myTrolley) {
        double change = myTrolley.getCostumer().getPaysWithMoney() - myTrolley.getTotalOwed() - myTrolley.getTotalDiscount();
        System.out.println("Uw totale korting bedraagt " + myTrolley.getTotalDiscount() + " euro");
        System.out.println("Uw totale wisselgeld bedraagt " + change + " euro");
    }

    public void getCorrectTrolley(ShoppingTrolley shoppingTrolley, Costumer costumer){
        for (ShoppingTrolley correctTrolley: Store.getShoppingTrolleys()) {
            if(correctTrolley.getCostumer() == costumer){
                totalOwed(correctTrolley);
                whatIsChange(correctTrolley);
            }
        }
    }
}
