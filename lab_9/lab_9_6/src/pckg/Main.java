package pckg;

import java.util.Scanner;

public class Main {
    public static void getKey(){
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        try {
            printDetails( key );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void printDetails(String key) throws Exception{
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private static String getDetails(String key) throws Exception{
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
       // printDetails("");
        printDetails("Key");
    }
}
