package com.company;

public class Ball {
    private int size;
    private String color;
    Ball(int size, String color)
    {
        this.size = size;
        this.color = color;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString()
    {
        return "Size: "+ size + "\nColor: " + color;
    }
}
