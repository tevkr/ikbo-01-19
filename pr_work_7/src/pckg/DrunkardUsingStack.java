package pckg;

import java.util.Stack;

public class DrunkardUsingStack extends Drunkard<Stack<Integer>> {
    @Override
    protected void moveCards(int winner) {
        Stack<Integer> temp = new Stack<>();
        int []cards = new int[2];
        cards[1] = firstPlayerCards.peek();
        cards[0] = secondPlayerCards.peek();
        firstPlayerCards.pop();
        secondPlayerCards.pop();
        if (winner == 1)
        {
            while(!firstPlayerCards.empty())
            {
                temp.push(firstPlayerCards.peek());
                firstPlayerCards.pop();
            }
            firstPlayerCards.push(cards[0]);
            firstPlayerCards.push(cards[1]);
            while(!temp.empty())
            {
                firstPlayerCards.push(temp.peek());
                temp.pop();
            }
        }
        else
        {
            while(!secondPlayerCards.empty())
            {
                temp.push(secondPlayerCards.peek());
                secondPlayerCards.pop();
            }
            secondPlayerCards.push(cards[0]);
            secondPlayerCards.push(cards[1]);
            while(!temp.empty())
            {
                secondPlayerCards.push(temp.peek());
                temp.pop();
            }
        }
    }

    @Override
    protected void firstPlayerPushCards(int[] cards) {
        for(int i = cards.length-1;i>=0;i--)
            firstPlayerCards.push(cards[i]);
    }

    @Override
    protected void secondPlayerPushCards(int[] cards) {
        for(int i = cards.length-1;i>=0;i--)
            secondPlayerCards.push(cards[i]);
    }

    @Override
    public void startGame(int[] fstCards, int[] scndCards) {
        firstPlayerCards = new Stack<>();
        secondPlayerCards = new Stack<>();
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
        return firstPlayerCards.empty();
    }

    @Override
    protected boolean isSecondPlayerEmpty() {
        return secondPlayerCards.empty();
    }
}
