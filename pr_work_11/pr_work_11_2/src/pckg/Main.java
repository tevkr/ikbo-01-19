package pckg;

public class Main {

    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue();
        aq.enqueue(1);
        aq.enqueue(1);
        aq.enqueue(1);
        System.out.println(aq.size());
        LinkedQueue lq = new LinkedQueue();
        lq.enqueue(1);
        lq.enqueue(1);
        lq.enqueue(1);
        System.out.println(lq.size());
    }
}
