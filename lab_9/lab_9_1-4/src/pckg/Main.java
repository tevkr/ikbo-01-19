package pckg;

import java.util.Scanner;

public class Main {
    public static void exceptionDemo1() {
        try{
            System.out.println( 2.0 / 0.0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
    public static void exceptionDemo2() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        finally {
            System.out.println("Finally");
        }
    }
    public static void main(String[] args) {
        //exceptionDemo1();// 2/0 -> exception && 2.0/0.0 -> Infinity
        exceptionDemo2();
        /*
        * Без try catch:
        * Qwerty -> NumberFormatException
        * 1.2 -> NumberFormatException
        * 1 -> 2
        *
        * c try catch:
        * Qwerty -> NumberFormatException Finally (Нет ошибок)
        * 1.2 -> NumberFormatException Finally (Нет ошибок)
        * 1 -> 2 Finally (Нет ошибок)
        * */
    }
}
