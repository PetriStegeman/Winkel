package nl.appie;

import java.time.DayOfWeek;
import java.util.List;

public class Discount {

    private String beschrijving;
    private List<EWeekdays> weekdays;


    //2 voor 1 op woensdag
public void setDiscount1(Product product){

    if(product.isDiscounted()){
        product.setPrice(product.getPrice()/2);
    }

}


}
