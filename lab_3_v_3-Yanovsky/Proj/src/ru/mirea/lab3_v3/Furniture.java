package ru.mirea.lab3_v3;

public abstract class Furniture {
    private String manufacturer;
    private String color;
    private double price;
    public Furniture(String manufacturer, String color, double price)
    {
        this.manufacturer = manufacturer;
        this.color = color;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void displayInfo();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
