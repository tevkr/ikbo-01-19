package pckg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //Task 1
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d+(.\\d+)* (RUB|USD|EU)");
        Matcher matcher = pattern.matcher(input);
        String res = "";
        int pos = 0;
        while(matcher.find(pos))
        {
            res += matcher.group() + " ";
            pos = matcher.end();
        }
        System.out.println(res);
    }
}
