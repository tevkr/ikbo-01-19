package pckg;

import java.util.Scanner;

public class Main {
    public static void ex14(int N)
    {
        System.out.print(Integer.toString(N).charAt(0) + " ");
        N = N % (int) Math.pow(10, (int) Math.log10(N));;
        if (N != 0)ex14(N);
    }
    public static void ex15(int N)
    {
        System.out.print(N % 10 + " ");
        N /= 10;
        if(N != 0) ex15(N);
    }
    public static int ex16(int max, int count)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x==0)
            return count;
        else if (x > max)
        {
            max = x;
            count = 1;
        }
        else if (x == max)
            count++;
        count = ex16(max,count);
        return count;
    }
    public static void main(String[] args) {
        //System.out.println(ex16(-1,0));
        //ex14(123456);
        //ex15(123456);
    }
}
