package ru.mirea.pr_work_3_1to3;

public class Square extends Rectangle
{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square( double side, String color, boolean filled) {
        super(side, side,color, filled);
    }
    public double getSide()
    {
        return width;
    }
    public void setSide(double side)
    {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, side: "+this.width+", color: "+this.color+", filled: "+this.filled;
    }
}
