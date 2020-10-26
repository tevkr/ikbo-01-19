package pckg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Item dish1 = new Dish(1, "name1", "description1");
        Item dish2 = new Dish(2, "name2", "description2");
        Item drink1 = new Drink(3, "name3", "description3");
        Item drink2 = new Drink(4, "name4", "description4");
        Order order1 = new RestaurantOrder();
        order1.add(dish1);
        order1.add(drink1);
        System.out.println("order1:");
        System.out.println(Arrays.toString(order1.getSortedArray()));
        Order order2 = new InternetOrder();
        order2.add(dish2);
        order2.add(drink2);
        System.out.println("order2:");
        System.out.println(Arrays.toString(order2.getSortedArray()));
        InternetOrder order3 = new InternetOrder();
        order3.add("address1", order2);
        order3.add("address1", drink1);
        System.out.println("order3:");
        order3.getOrders();
        System.out.println(Arrays.toString(order1.getArrayOfNames()));
        order1.add(dish2);
        System.out.println("add item to order1:");
        System.out.println(Arrays.toString(order1.getArrayOfNames()));
        System.out.println("Num of orders in order1: " + order1.numOfOrders());
        System.out.println("Total sum in order1: " + order1.getSumPrice());
        order1.delete("name5");
        System.out.println(Arrays.toString(order1.getArrayOfNames()));
        order1.add(drink1);
        order1.add(drink1);
        System.out.println(Arrays.toString(order1.getArrayOfNames()));
        System.out.println("deleted: " + order1.deleteAll("name3"));
        System.out.println(Arrays.toString(order1.getArrayOfNames()));
    }
}
