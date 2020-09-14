package pckg;

import java.util.LinkedList;

public class DrunkardUsingDoubleList extends Drunkard<LinkedList<Integer>>{
    @Override
    protected void moveCards(int winner) {

        if (winner == 1)
        {
            firstPlayerCards.add(firstPlayerCards.poll());
            firstPlayerCards.add(secondPlayerCards.poll());
        }
        else
        {
            secondPlayerCards.add(firstPlayerCards.poll());
            secondPlayerCards.add(secondPlayerCards.poll());
        }
    }

    @Override
    protected void firstPlayerPushCards(int[] cards) {
        for(int i = 0;i<cards.length;i++)
            firstPlayerCards.add(cards[i]);
    }

    @Override
    protected void secondPlayerPushCards(int[] cards) {
        for(int i = 0;i<cards.length;i++)
            secondPlayerCards.add(cards[i]);
    }

    @Override
    public void startGame(int[] fstCards, int[] scndCards) {
        firstPlayerCards = new LinkedList<>();
        secondPlayerCards = new LinkedList<>();
        firstPlayerPushCards(fstCards);
        secondPlayerPushCards(scndCards);
        int counter = 0;
        while(!isFirstPlayerEmpty() && !isSecondPlayerEmpty() && counter < 106)
        {
            if (firstPlayerCards.peek() > secondPlayerCards.peek() && (firstPlayerCards.peek() != 9 || secondPlayerCards.peek() != 0))
                moveCards(1);
            else
                moveCards(2);
            counter++;
        }
        if (isSecondPlayerEmpty())
            System.out.println("first " + counter);
        else if (isFirstPlayerEmpty())
            System.out.println("second " + counter);
        else
            System.out.println("botva");
    }

    @Override
    protected boolean isFirstPlayerEmpty() {
        return firstPlayerCards.isEmpty();
    }

    @Override
    protected boolean isSecondPlayerEmpty() {
        return secondPlayerCards.isEmpty();
    }
}
