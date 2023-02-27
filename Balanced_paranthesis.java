import java.util.Stack;
import java.util.*;

public class Balanced_paranthesis {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.charAt(0) == '{')
            System.out.println("false");

        Stack<Character> stack = new Stack<Character>();

        char c;
        for(int i=0; i < str.length(); i++) {
            c = str.charAt(i);

            if(c == '(')
                stack.push(c);
            else if(c == '{')
                stack.push(c);
            else if(c == '[')
                stack.push(c);
            else if(c == ')')
                if(stack.empty())
                    System.out.println("false");
                else if(stack.peek() == '(')
                    stack.pop();
                else
                    System.out.println("false");
            else if(c == '}')
                if(stack.empty())
                    System.out.println("false");
                else if(stack.peek() == '{')
                    stack.pop();
                else
                    System.out.println("false");
            else if(c == ']')
                if(stack.empty())
                    System.out.println("false");
                else if(stack.peek() == '[')
                    stack.pop();
                else
                    System.out.println("true");
        }
        System.out.println("stack is empty");
    }
}
