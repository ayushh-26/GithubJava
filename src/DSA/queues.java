package DSA;
//Ayush Sehrawat
// 22CSU041

public class queues {
    int DefSize = 5;
    int size;
    int[] q;
    int end = 0;
    queues(int size){
        this.q = new int[size];
    }
    queues(){
        this.q = new int[DefSize];
    }
    public boolean isEmpty(){
        if(end == -1 || end<q.length-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(end == q.length-1){
            return true;
        }
        return false;
    }
    public void push(int item){
        if(isFull()){
            System.out.print("queue is full");
        }
        q[end] = item;
        end++;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int removedItem = q[0];
        for(int i=1; i<end; i++){
            q[i-1] = q[i];
        }
        return removedItem;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return q[0];
    }

    public static void main(String[] args) {
        queues q1 = new queues();
        System.out.println(q1.isEmpty());
        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.push(4);
        q1.push(5);
        //q1.push(6);
        System.out.println(q1.isFull());
        System.out.println(q1.pop());
        System.out.println(q1.pop());
    }
}