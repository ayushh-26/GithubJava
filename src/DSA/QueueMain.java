package DSA;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(67);
        queue.enqueue(66);
        queue.display();
        System.out.println(queue.dequeue());
        queue.enqueue(200);
        queue.display();
        System.out.println(queue.dequeue());
        queue.enqueue(120);
        queue.display();
    }
}
