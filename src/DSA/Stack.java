package DSA;

class Stack {
    int index = -1;
    int[] SizeOfStack;
    final int DEFAULT_SIZE = 10;
    Stack(int size){
        this.SizeOfStack = new int[size];
    }
    Stack(){
        this.SizeOfStack = new int[DEFAULT_SIZE];
    }
    public void push(int data){
        if(index == SizeOfStack.length-1){
            System.out.print("stack is full");
        }
        index++;
        SizeOfStack[index] = data;
    }
    public int pop(){
        if(index == -1){
            System.out.print("stack is empty");
        }
        return SizeOfStack[index--];
    }
    public int peek(){
        return SizeOfStack[index];
    }
    public boolean isEmpty(){
        if(index == -1 || index<SizeOfStack.length-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(index == SizeOfStack.length-1){
            return true;
        }
        return false;
    }
    public void printStack(){
        if(isEmpty()){
            System.out.println("stack empty");
        }
        for(int i=index; i>=0; i--){
            System.out.println(SizeOfStack[i]);
            System.out.println("-----");
        }
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack(6);
        stack1.push(9);
        stack1.push(8);
        stack1.push(7);
        stack1.push(6);
        stack1.push(5);
        stack1.push(4);
        //System.out.println(stack1.pop());
        //System.out.println(stack1.pop());
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.isFull());
        System.out.println(stack1.peek());
        stack1.printStack();

    }
}