import java.util.LinkedList;

public class Main {
    public static void main(String args[]) {
        // Create LinkedList of String type
        LinkedList<String> linkedList = new LinkedList<String>();

        // add elements
        linkedList.add("Charlie");
        System.out.println(linkedList);
        linkedList.add("Sam");
        System.out.println(linkedList);
        linkedList.addFirst("Alex");
        System.out.println(linkedList);
        linkedList.addLast("Taylor");
        System.out.println(linkedList);
        linkedList.add(2, "Pat");

        System.out.println(linkedList);

        // remove elements
        linkedList.remove("Pat");
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();

        System.out.println(linkedList);
    }
}