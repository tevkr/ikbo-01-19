package pckg;

import java.util.Arrays;
import java.util.Collection;

public class OrderManager implements Order {

    private final MyLinkedList<Item> data;

    public OrderManager() {
        this.data = new MyLinkedList<>();
    }

    public OrderManager(Collection<Item> collection) {
        this.data = new MyLinkedList<>(collection);
    }

    @Override
    public boolean add(Item item) {
        return data.add(item);
    }

    @Override
    public boolean delete(String name) {
        Item item = null;
        Object[] arr = data.toArray();
        for(int i = 0; i < arr.length; i++)
        {
            if(((Item)arr[i]).getName().equals(name))
            {
                item = ((Item)arr[i]);
                break;
            }
        }
        if (item == null)
            return false;
        return data.remove(item);
    }

    @Override
    public int deleteAll(String name) {
        int count = 0;
        Item item = null;
        Object[] arr = data.toArray();
        for(int i = 0; i < arr.length; i++)
        {
            if(((Item)arr[i]).getName().equals(name))
            {
                data.remove((Item)arr[i]);
                count++;
            }
        }
        return count;
    }

    @Override
    public int numOfOrders() {
        return data.getSize();
    }

    @Override
    public Object[] getArray() {
        return data.toArray();
    }

    @Override
    public double getSumPrice() {
        Object[] arr = data.toArray();
        double result = 0;
        for(int i = 0; i < arr.length;i++)
            result += ((Item)arr[i]).getPrice();
        return result;
    }

    @Override
    public Object[] getArrayOfNames() {
        Object[] arr = data.toArray();
        Object[] arr2 = new Object[arr.length];
        for(int i = 0; i < arr.length;i++)
        {
            arr2[i] = ((Item)arr[i]).getName();
        }
        return arr2;
    }

    @Override
    public Object[] getSortedArray() {
        Object[] arr = data.toArray();
        for(int i = data.getSize()-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if(((Item)arr[j]).getPrice() < ((Item)arr[j+1]).getPrice() ){
                    Object tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}