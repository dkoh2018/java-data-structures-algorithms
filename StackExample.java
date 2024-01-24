import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] arg) {
        Stack<String> stack = new Stack<String>(); 

        stack.push("BMW");  
        stack.push("Audi");  
        stack.push("Ferrari");  
        stack.push("Bugatti");  
        stack.push("Jaguar");
        stack.pop();

        if (!stack.isEmpty()) {
            System.out.println("The length of the array: " + stack.size());
        }

        Iterator<String> iterator = stack.iterator();
        while(iterator.hasNext()){
            Object values = iterator.next();
            System.out.println(values);
        }

    }   
}
