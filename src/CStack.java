class CStack {
    int index = -1;
    char[] sizeOfStack;
    final int DEFAULT_SIZE = 10;

    CStack(int size) {
        this.sizeOfStack = new char[size];
    }

    CStack() {
        this.sizeOfStack = new char[DEFAULT_SIZE];
    }

    public void push(char data) {
        if (index == sizeOfStack.length - 1) {
            System.out.println("Stack is full");
        }
        index++;
        sizeOfStack[index] = data;
    }

    public char pop() {
        if (index == -1) {
            System.out.println("Stack is empty");
            return '\0'; // Return a placeholder character for empty stack
        }
        return sizeOfStack[index--];
    }

    public char peek() {
        if (index == -1) {
            System.out.println("Stack is empty");
            return '\0'; // Return a placeholder character for empty stack
        }
        return sizeOfStack[index];
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public boolean isFull() {
        return index == sizeOfStack.length - 1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = index; i >= 0; i--) {
            System.out.println(sizeOfStack[i]);
            System.out.println("-----");
        }
    }

    public static char[] rev(String str) {
        CStack c1 = new CStack(str.length());
        for (int i = 0; i < str.length(); i++) {
            c1.push(str.charAt(i));
        }
        char[] r = new char[str.length()];
        int i = 0;
        while (!c1.isEmpty()) {
            r[i++] = c1.pop();
        }
        return r;
    }

    public static void main(String[] args) {
        String s = "Apple is a global brand";
        System.out.println(s);
        char[] reversed = rev(s);
        System.out.println(new String(reversed));
    }
}