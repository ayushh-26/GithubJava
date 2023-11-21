
package DSA;
import java.util.LinkedList;

class Deque {
    private LinkedList<Integer> deque;
    private int maxSize;

    public Deque(int size) {
        deque = new LinkedList<>();
        maxSize = size;
    }
    public void enqueueRear(int item) {
        if (!isFull()) {
            deque.addLast(item);
            System.out.println("Enqueued at the rear: " + item);
        } else {
            System.out.println("Deque is full. Cannot enqueue.");
        }
    }
    public void enqueueFront(int item) {
        if (!isFull()) {
            deque.addFirst(item);
            System.out.println("Enqueued at the front: " + item);
        } else {
            System.out.println("Deque is full. Cannot enqueue.");
        }
    }
    public void dequeueFront() {
        if (!isEmpty()) {
            int item = deque.removeFirst();
            System.out.println("Dequeued from the front: " + item);
        } else {
            System.out.println("Deque is empty. Cannot dequeue from the front.");
        }
    }
    public void dequeueRear() {
        if (!isEmpty()) {
            int item = deque.removeLast();
            System.out.println("Dequeued from the rear: " + item);
        } else {
            System.out.println("Deque is empty. Cannot dequeue from the rear.");
        }
    }
    public boolean isFull() {
        return deque.size() == maxSize;
    }
    public boolean isEmpty() {
        return deque.isEmpty();
    }
    public void peekFront() {
        if (!isEmpty()) {
            int item = deque.getFirst();
            System.out.println("Front element: " + item);
        } else {
            System.out.println("Deque is empty. Cannot peek at the front.");
        }
    }
    public void peekRear() {
        if (!isEmpty()) {
            int item = deque.getLast();
            System.out.println("Rear element: " + item);
        } else {
            System.out.println("Deque is empty. Cannot peek at the rear.");
        }
    }
}

public class DequeOperations {
    public static void main(String[] args) {
        Deque deque = new Deque(5);

        deque.enqueueRear(35);
        deque.enqueueFront(25);
        deque.enqueueRear(70);
        deque.enqueueFront(89);

        deque.peekFront();
        deque.peekRear();

        deque.dequeueFront();
        deque.dequeueRear();

        deque.peekFront();
        deque.peekRear();
    }
}