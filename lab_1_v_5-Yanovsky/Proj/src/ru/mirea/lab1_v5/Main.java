package ru.mirea.lab1_v5;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println(fact(0));//1
        System.out.println(fact(3));//6
        System.out.println(fact(7));//5040
    }
    public static int fact(int a)
    {
        int res = 1;
        for (int i = 1; i <= a; i++)
            res *= i;
        return res;
    }
}
