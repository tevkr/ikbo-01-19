package ru.mirea.lab3_v3;

public class Table extends Furniture{
    private static int count = 0;
    private String typeOfWood;
    private int id;

    public Table(String manufacturer, String color, double price, String typeOfWood) {
        super(manufacturer, color, price);
        this.typeOfWood = typeOfWood;
        count++;
        id = count;
    }

    public String getTypeOfWood() {
        return typeOfWood;
    }

    public void setTypeOfWood(String typeOfWood) {
        this.typeOfWood = typeOfWood;
    }

    @Override
    public void displayInfo() {
        System.out.println("Table" + id + ": " + getManufacturer() + ", " + getColor() + ", " + typeOfWood + ". Price: " + getPrice());
    }

    public int getId() {
        return id;
    }
}
