package ru.mirea.lab3_v3;

import java.util.Scanner;

public class FurnitureShop
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Chair[] chairs =
                {
                        new Chair("China", "Brown", 5.99, true),
                        new Chair("China", "Black", 3.99, false),
                        new Chair("China", "Red", 3.99, false)
                };
        Table[] tables =
                {
                        new Table("Germany", "Black", 9.99, "Oak"),
                        new Table("Russia", "White", 6.50, "Birch"),
                        new Table("Russia", "Brown", 7.90, "Pine")
                };
        double money = 15.50;
        while(true)
        {
            System.out.println("----------------------------------------");
            System.out.println("Furniture Shop\t\tYour money: "+ money);
            System.out.println("Chairs:");
            for(int i = 0;i<chairs.length;i++)
            {
                System.out.print("\t"+(i+1)+" "); chairs[i].displayInfo();
            }
            System.out.println("Tables:");
            for(int i = 0;i<tables.length;i++)
            {
                System.out.print("\t"+(i+1+chairs.length)+" "); tables[i].displayInfo();
            }
            System.out.print("\nSelect one of the positions or write 0 to exit: ");
            int choice = scan.nextInt();
            if(choice == 0)
                break;
            else if (choice <= 3)
            {
                if (chairs[choice-1].getPrice() > money)
                {
                    System.out.println("Sorry, not enough money");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else
                {
                    money-= chairs[choice-1].getPrice();
                    System.out.println("Thanks for choosing our shop!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            else if (choice > 3 && choice <= 6)
            {
                if (tables[choice-1-chairs.length].getPrice() > money) {
                    System.out.println("Sorry, not enough money");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else
                {
                    money-= tables[choice-1-chairs.length].getPrice();
                    System.out.println("Thanks for choosing our shop!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                System.out.println("Error!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
