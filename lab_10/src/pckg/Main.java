package pckg;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public static <T> ArrayList<T> arrayToArrayList(T[] array)//1
    {
        ArrayList<T> al = new ArrayList<>();
        for (T element:array)
            al.add(element);
        return al;
    }

    public static <T> T getByIndex(T[] array, int index)//3
    {
        return array[index];
    }

    public static void outFiveElements(File directory)
    {
        ArrayList<String> data = new ArrayList<>();
        if (directory.isDirectory()) {
            for (File file : directory.listFiles())
                data.add(file.getName());
            for (int i = 0;i<5;i++)
            {
                try {
                    System.out.println(data.get(i));
                }
                catch (Exception e) {}
            }
        }
        else
            System.out.println("Bad directory");
    }

    public static void main(String[] args) {
        //1
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"6", "7", "8", "9", "10" };
        ArrayList<Integer> intAl = arrayToArrayList(intArray);
        ArrayList<String> strAl = arrayToArrayList(strArray);
        for (Integer element: intAl)
            System.out.println(element);
        for (String element: strAl)
            System.out.println(element);
        //2

        AnyArrayStore<Long> aas = new AnyArrayStore(1);
        aas.add((long) 11);
        aas.arrayOut();
        aas.clear();

        //3
        System.out.println(getByIndex(intArray,0) + "" +getByIndex(intArray,1));

        //4
        outFiveElements(new File("C:\\Idea apps\\lab_10\\.idea"));
    }
}
