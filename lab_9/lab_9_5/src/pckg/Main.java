package pckg;

public class Main {
    public static void printMessage(String key) {
        try
        {
            String message = getDetails(key);
            System.out.println( message );
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        }


    }
    public static String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        printMessage(null);
        printMessage("123");
    }
}
