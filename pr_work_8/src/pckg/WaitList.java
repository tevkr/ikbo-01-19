package pckg;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @param <E> - generic type for list
 * @implNote class that implements IWaitList interface
 */
public class WaitList<E> implements IWaitList<E>
{
    protected ConcurrentLinkedQueue<E> content;
    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> contentCheck) {
        return content.containsAll(contentCheck);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    public WaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }
    public WaitList(Collection<E> c) {
        this.content = new ConcurrentLinkedQueue<>(content);
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
