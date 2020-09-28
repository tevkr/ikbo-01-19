package pckg;
/**
 * @param <E> - generic type for list
 */
public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;
    /**
     * @param capacity - capacity of list
     */
    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }
    /**
     * @return the capacity of list
     */
    public int getCapacity() {
        return capacity;
    }
    /**
     * @param element to add to the list
     */
    @Override
    public void add(E element) {
        super.add(element);
    }
    /**
     * @return String representation of object
     */
    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "content=" + content +
                '}';
    }
}
