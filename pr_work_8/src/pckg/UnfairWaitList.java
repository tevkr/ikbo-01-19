package pckg;
/**
 * @param <E> - generic type for list
 */
public class UnfairWaitList<E> extends WaitList<E>
{
    public UnfairWaitList()
    {
        super();
    }
    /**
     * @return the removed element
     */
    @Override
    public E remove() {
        return super.remove();
    }
    /**
     * @param element add to end of list
     */
    public void moveToBack(E element)
    {
        super.add(element);
    }
}
