package nl.appie;

import java.util.Calendar;

public class Discount1 implements IDiscount {

    private Product discountedProduct;

    //private String description;
    //2 frikandellen voor de prijst van 1 (1 euro) alleen op woensdag
    //Werken aan interface implementen

    public static void calculateDiscountPrice(ShoppingTrolley myTrolley, Product discountedProduct) {

        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        double totalDiscount = 0.00;
        if(day == Calendar.WEDNESDAY) {
            int item = 0;
            for (Product product : myTrolley.getContentsOfTrolley()) {
                if (product.equals(discountedProduct)) {
                    item++;
                }
            }
            totalDiscount = (item - item % 2) / 2;
        }
        myTrolley.setTotalDiscount(myTrolley.getTotalDiscount()+totalDiscount);
    }

    public Product getDiscountedProduct() {
        return discountedProduct;
    }

    public void setDiscountedProduct(Product discountedProduct) {
        this.discountedProduct = discountedProduct;
    }
}
