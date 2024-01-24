import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // push elements to stack (add to the top)
        stack.push("First");
        System.out.println(stack);
        stack.push("Second");
        System.out.println(stack);
        stack.push("Third");
        System.out.println(stack);
        stack.peek();
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
