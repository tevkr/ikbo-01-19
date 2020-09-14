package pckg;

public class Book implements Priceable {
    private double price;
    private String name;
    public Book(double price, String name) {
        this.price = price;
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
