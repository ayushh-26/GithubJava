package DSA;
import java.util.*;

class StackArr{
    int top=-1;
    int size;
    char[] arr;

    StackArr(){
       arr = new char[10];
    }

    StackArr(int s){
       arr = new char[s]; 
    }
    
    void push(char d){

       if (top==arr.length){
          System.out.print("Overflow");
       }
       else{
          top++;
          arr[top]=d;
          size++;
       }
    }
    
    char pop(){
       if (top==-1){
          return '\u0000';
       }
       else{
          char ele=arr[top];
          top--;
          size--;
          return ele;
       }
    }
    
    void display(){
       if (top==-1){
          System.out.println("Empty Stack");
       }
       else{
          System.out.println("\nStack :");
          for(int i = top; i>=0 ; i--){
             System.out.print(arr[i]+" ");
          }
          System.out.println();
          System.out.println("Top->"+arr[top]+"\n");
       }
    }

    int Size(){
       return size;
    }

    char peek(){
       if (size!=0) {
          return arr[top];
       }
       else{
          return '\u0000';
       }
    }
}

public class InfixPostfixStack {

    public static int getprecedence(char x) {
        if (x == '^') {
            return 2;
        } else if (x == '*' || x == '/') {
            return 1;
        } else if (x == '+' || x == '-') {
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Infix Expression: ");
        String inf_expr = sc.nextLine();
        String pos_expr = "";
        StackArr sa4 = new StackArr(inf_expr.length());

        if (inf_expr.length() != 0) {
            for (int i = 0; i < inf_expr.length(); i++) {
                char x = inf_expr.charAt(i);

                if (x == '^') {
                    while (getprecedence(sa4.peek()) >= getprecedence(x)) {
                        pos_expr += sa4.pop();
                    }
                    sa4.push('^');
                } else if (x == '/') {
                    while (getprecedence(sa4.peek()) >= getprecedence(x)) {
                        pos_expr += sa4.pop();
                    }
                    sa4.push('/');
                } else if (x == '*') {
                    while (getprecedence(sa4.peek()) >= getprecedence(x)) {
                        pos_expr += sa4.pop();
                    }
                    sa4.push('*');
                } else if (x == '+') {
                    while (getprecedence(sa4.peek()) >= getprecedence(x)) {
                        pos_expr += sa4.pop();
                    }
                    sa4.push('+');
                } else if (x == '-') {
                    while (getprecedence(sa4.peek()) >= getprecedence(x)) {
                        pos_expr += sa4.pop();
                    }
                    sa4.push('-');
                } else if (x == '(') {
                    sa4.push('(');
                } else if (x == ')') {
                    while (sa4.peek() != '(' && sa4.Size() > 0) {
                        pos_expr += sa4.pop();
                    }
                    sa4.pop();
                } else if (x == ' ') {
                    continue;
                } else {
                    pos_expr += x;
                }
            }

            while (sa4.Size() > 0) {
                pos_expr += sa4.pop();
            }

            System.out.println("Postfix Expression: " + pos_expr);
        } else {
            System.out.println("Please Enter a Infix Expression");
        }
    }
}