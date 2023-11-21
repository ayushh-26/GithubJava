
package DSA;

public class LinkedListQueue {
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    private Node front;
    private Node rear;
    public LinkedListQueue(){
        front = rear = null;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public void enqueue(int value){
        Node node = new Node(value);
        if (isEmpty()){
            front = rear = node;
            return;
        }
        rear.next = node;
        rear = node;
    }
    public void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;
        if (front == null){
            rear = null;
        }
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return front.value;
    }

        public static void main(String[] args) throws Exception {
            LinkedListQueue queue = new LinkedListQueue();
            System.out.println(queue.isEmpty());
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);
            System.out.println(queue.peek());
            queue.dequeue();
            System.out.println(queue.peek());
            System.out.println(queue.isEmpty());
        }
    }

