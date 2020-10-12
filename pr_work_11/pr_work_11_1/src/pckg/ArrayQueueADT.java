package pckg;
import java.util.Arrays;

public class ArrayQueueADT {
    private int size;
    private Object[] elements = new Object[5];

    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert element != null;

        queue.elements = Arrays.copyOf(queue.elements, ++queue.size);
        queue.elements[queue.size-1] = element;
    }

    public static Object dequeue(ArrayQueueADT queue) {
        assert queue.size > 0;

        Object value = queue.element(queue);
        Object[] copy_elements = new Object[--queue.size];
        for(int i = 1;i<=queue.size;i++) copy_elements[i-1] = queue.elements[i];
        queue.elements = copy_elements;
        return value;
    }

    public static Object element(ArrayQueueADT queue) {
        assert queue.size > 0;

        return queue.elements[0];
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static ArrayQueueADT clear() {
        return new ArrayQueueADT();
    }
}