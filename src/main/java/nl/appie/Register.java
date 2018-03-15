package nl.appie;


public class Register {

    public void totalOwed(Costumer costumer){
        double totalOwed = 0.00;
        for (ShoppingTrolley correctTrolley: Store.getShoppingTrolleys()) {
            if(correctTrolley.getCostumer().getCostumerID()==costumer.getCostumerID()){
                for (Product items: correctTrolley.getContentsOfTrolley()) {
                    totalOwed += items.getPrice();
                }
                System.out.println("Het totaal verschuldigde bedrag is " + totalOwed + " euro");
                correctTrolley.setTotalOwed(totalOwed);
            }
        }
    }

    public void whatIsChange(Costumer costumer) {
        for (ShoppingTrolley correctTrolley:Store.getShoppingTrolleys()) {
            if(correctTrolley.getCostumer().getCostumerID()==costumer.getCostumerID()){
                double change = correctTrolley.getCostumer().getPaysWithMoney() - correctTrolley.getTotalOwed() - correctTrolley.getTotalDiscount();
                System.out.println("Uw totale korting bedraagt " + correctTrolley.getTotalDiscount() + " euro");
                System.out.println("Uw totale wisselgeld bedraagt " + change + " euro");
            }
        }
    }

    //naar store
    public void adjustStock(Costumer costumer){

        for (ShoppingTrolley correctTrolley:Store.getShoppingTrolleys()){
            if(correctTrolley.getCostumer().getCostumerID()==costumer.getCostumerID()){
                for (Product eachproduct:correctTrolley.getContentsOfTrolley()) {
                    eachproduct.setInStock(eachproduct.getInStock()-1);
                }
            }
        }

    }


}
