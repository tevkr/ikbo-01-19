package pckg;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        System.out.println("arrayQueue: ");
        System.out.println(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.element());

        System.out.println("ArrayQueueModule: ");
        System.out.println(ArrayQueueModule.isEmpty());
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(1);
        System.out.println(ArrayQueueModule.isEmpty());
        System.out.println(ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.element());

        ArrayQueueADT queueadt = new ArrayQueueADT();
        System.out.println("ArrayQueueADT: ");
        System.out.println(queueadt.isEmpty(queueadt));
        queueadt.enqueue(queueadt,1);
        queueadt.enqueue(queueadt,1);
        queueadt.enqueue(queueadt,1);
        System.out.println(queueadt.isEmpty(queueadt));
        System.out.println(queueadt.size(queueadt));
        System.out.println(queueadt.element(queueadt));
    }
}
