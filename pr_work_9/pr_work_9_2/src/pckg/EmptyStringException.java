package pckg;

public class EmptyStringException extends Exception {
    EmptyStringException()
    {
        super("The string is empty!");
    }
}
