package pckg;

public class Processor implements Priceable{
    private double price;
    private String model;

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processor(double price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
