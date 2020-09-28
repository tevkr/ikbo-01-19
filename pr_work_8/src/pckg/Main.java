package pckg;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for testing waitLists
 *
 * @author Yanovsky Vladislav
 */
public class Main {

    public static void main(String[] args) {
        //Bounded list
        WaitList<Integer> boundedWaitList = new BoundedWaitList<>(10);
        for (int i = 0; i < 10; i++)
            boundedWaitList.add(i);
        System.out.println(boundedWaitList);
        System.out.println("Contains 9: " + boundedWaitList.contains(9));
        System.out.println("Remove first: " + boundedWaitList.remove());
        System.out.println("Is empty: " + boundedWaitList.isEmpty());
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lst.add(i);
        }
        System.out.println("Contains lst: " + boundedWaitList.containsAll(lst));
        System.out.println();

        //Unfair list
        UnfairWaitList<Integer> stringUnfairWaitList = new UnfairWaitList<>();
        for (int i = 0; i < 10; i++)
            stringUnfairWaitList.add(i);
        System.out.println(boundedWaitList);
        System.out.println("Contains 9: " + stringUnfairWaitList.contains(9));
        System.out.println("Remove first: " + stringUnfairWaitList.remove());
        System.out.println("Is empty: " + stringUnfairWaitList.isEmpty());
        for (int i = 0; i < 10; i++) {
            lst.add(i);
        }
        System.out.println("Contains lst: " + stringUnfairWaitList.containsAll(lst));
        System.out.println();
    }
}
