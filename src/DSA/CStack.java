package DSA;
// Ayush Sehrawat
// 22CSU041
class CStack{
    int index = -1;
    String[] SizeOfStack;
    final int DEFAULT_SIZE = 10;
    CStack(int size){
        this.SizeOfStack = new String[size];
    }
    CStack(){
        this.SizeOfStack = new String[DEFAULT_SIZE];
    }
    public void push(String data){
        if(index == SizeOfStack.length-1){
            System.out.print("stack is full");
        }
        index++;
        SizeOfStack[index] = data;
    }
    public String pop(){
        if(index == -1){
            System.out.print("stack is empty");
        }
        return SizeOfStack[index--];
    }
    public String peek(){
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

    public static StringBuilder rev(String str){
        String[] arr = str.split(" ");
        CStack c1 = new CStack();
        int i=0;
        while(i<arr.length){
            c1.push(arr[i]);
            i++;
        }
        StringBuilder reversed = new StringBuilder(" ");
        int j=0;
        while(j<arr.length){
            reversed.append(c1.pop()+" ");
            j++;
        }
        return reversed;
    }



    public static void main(String[] args) {
        String s = "Google is a global brand";
        System.out.println(s);
        String[] arr = s.split(" ");
        System.out.print(rev(s));
    }
}