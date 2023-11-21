import java.util.*;

public class ParanthesesBalancing {

    public static boolean areParenthesesBalanced(String str) {
        Stack<Character> stack = new Stack<>();


        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();


                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }


        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(a+b)*c";
        System.out.print(str);
        if (areParenthesesBalanced(str)) {
            System.out.println(" :-Parentheses Balanced");
        } else {
            System.out.println(" :-Parentheses Not Balanced");
        }

    }
}