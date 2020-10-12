package pckg;
import java.util.Arrays;

public class ArrayQueueModule {
    private static int size;
    private static Object[] elements = new Object[5];

    public static void enqueue(Object element) {
        assert element != null;

        elements = Arrays.copyOf(elements, ++size);
        elements[size-1] = element;
    }

    public static Object dequeue() {
        assert size > 0;

        Object value = element();
        Object[] copy_elements = new Object[--size];
        for(int i = 1;i<=size;i++) copy_elements[i-1] = elements[i];
        elements = copy_elements;
        return value;
    }

    public static Object element() {
        assert size > 0;

        return elements[0];
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static ArrayQueueModule clear() {
        return new ArrayQueueModule();
    }
}