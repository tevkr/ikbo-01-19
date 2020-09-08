package ru.mirea.pr_work_3_4to5;

public class MovableRectangle implements Movable
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    private boolean isSpeedEqual(int Speed1, int Speed2)
    {
        if(Speed1 == Speed2) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "MovableRectangle:" + "topLeft x: " + topLeft.x + ", topLeft y: " + topLeft.y
                +", bottomRight x: " + bottomRight.x + ", bottomRight y: " + bottomRight.y + ", speedX: " + topLeft.xSpeed + ", speedY: " + topLeft.ySpeed ;
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
}
