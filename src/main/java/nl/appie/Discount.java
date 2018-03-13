package nl.appie;

import java.time.DayOfWeek;
import java.util.List;

public class Discount {

    private int discountID;
    private String beschrijving;
    private List<EWeekdays> weekdays;

    public int getDiscountID() {
        return discountID;
    }

    public void setDiscountID(int discountID) {
        this.discountID = discountID;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public List<EWeekdays> getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(List<EWeekdays> weekdays) {
        this.weekdays = weekdays;
    }
}
