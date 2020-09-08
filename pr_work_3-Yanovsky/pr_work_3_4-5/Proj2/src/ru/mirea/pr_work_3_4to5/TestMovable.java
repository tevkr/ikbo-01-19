package ru.mirea.pr_work_3_4to5;

public class TestMovable {

    public static void main(String[] args) {
        MovableCircle c = new MovableCircle(0 , 0, 3, 4, 1);
        System.out.println(c);
        c.moveUp();
        c.moveLeft();
        System.out.println(c);

        MovableRectangle r = new MovableRectangle(0, 0, 4, 4, 3, 3);
        System.out.println(r);
        r.moveRight();
        System.out.println(r);
    }
}
