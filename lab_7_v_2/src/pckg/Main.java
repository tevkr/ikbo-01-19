package pckg;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();// добавим в список ряд элементов
        ll.add("element2");
        ll.add("element3");
        ll.addLast("element4");  //  добавляем  на  последнее место
        ll.addFirst("element0"); // добавляем на первое место
        ll.add(1, "element1"); // добавляем элемент по индексу 1
        System.out.printf("В списке %d элементов \n", ll.size());
        System.out.println(ll.get(1));
        ll.set(1, "element1 new");
        for(String el : ll){
            System.out.println(el);
        }
    }
}
