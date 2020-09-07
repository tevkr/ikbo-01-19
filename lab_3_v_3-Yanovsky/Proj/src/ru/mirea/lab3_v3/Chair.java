package ru.mirea.lab3_v3;

public class Chair extends Furniture {
    private static int count = 0;
    private boolean isLeather;
    private int id;

    public Chair(String manufacturer, String color, double price, boolean isLeather) {
        super(manufacturer, color, price);
        this.isLeather = isLeather;
        count++;
        id = count;
    }

    public boolean isLeather() {
        return isLeather;
    }

    public void setLeather(boolean leather) {
        isLeather = leather;
    }

    @Override
    public void displayInfo() {
        System.out.println("Chair" + id + ": " + getManufacturer() + ", " + getColor() + ", " + isLeather + ". Price: " + getPrice());
    }

    public int getId() {
        return id;
    }
}
