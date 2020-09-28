package pckg;

import java.util.Arrays;

public class AnyArrayStore<T> {//2
    private T[] array;
    private int currentData;
    AnyArrayStore(int size)
    {
        array = (T[]) new Object[size];
        currentData = 0;
    }
    void add(T element)
    {
        array[currentData++] = element;
    }
    T get(int index)
    {
        return array[index];
    }
    void clear()
    {
        Arrays.fill(array,null);
    }
    void arrayOut()
    {
        for (T element:array)
            System.out.println(element);
    }
}
