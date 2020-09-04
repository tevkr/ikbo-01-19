package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ball ball = new Ball(scan.nextInt(),scan.next());//Size, color
        Book book = new Book(scan.next(),scan.nextInt());//Name, pages
        Dog dog = new Dog(scan.next(),scan.next());//Name, color
        System.out.println("\nBall info:");
        System.out.println(ball.toString());
        System.out.println("\nBook info:");
        System.out.println(book.toString());
        System.out.println("\nDog info:");
        System.out.println(dog.toString());
    }
}