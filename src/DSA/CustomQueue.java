package DSA;
public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public boolean enqueue(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int dequeue() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

        public static void main(String[] args) throws Exception {
            CustomQueue queue = new CustomQueue(5);
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);
            queue.display();
            System.out.println(queue.isEmpty());
            System.out.println(queue.isFull());
            queue.dequeue();
            queue.dequeue();
            queue.display();
        }
    }
