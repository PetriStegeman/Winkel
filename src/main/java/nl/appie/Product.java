package nl.appie;

public class Product {

    private String name;
    private double price;
    private boolean isDiscounted;

    public Product(String name, double price, boolean isDiscounted) {
        this.name = name;
        this.price = price;
        this.isDiscounted = isDiscounted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public void setDiscounted(boolean discounted) {
        isDiscounted = discounted;
    }
}
