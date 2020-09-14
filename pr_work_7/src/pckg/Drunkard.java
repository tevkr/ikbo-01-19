package pckg;

public abstract class Drunkard<T> {
    protected T firstPlayerCards;
    protected T secondPlayerCards;
    protected abstract void moveCards(int winner);
    protected abstract void firstPlayerPushCards(int[] cards);
    protected abstract void secondPlayerPushCards(int[] cards);
    public abstract void startGame(int[] fstCards, int[] scndCards);
    protected int compare(int x1, int x2)
    {
        return x1 - x2;
    }
    protected abstract boolean isFirstPlayerEmpty();
    protected abstract boolean isSecondPlayerEmpty();
}
