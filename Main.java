import java.util.LinkedList;

public class Main {
    public static void main(String args[]) {
        LinkedList<String> phoneBook = new LinkedList<String>();

        // Add elements (Memorize and Quiz yourself)
        phoneBook.add("Pat");
        phoneBook.add("Charlie");
        phoneBook.add("Sam");
        phoneBook.addFirst("Alex");
        phoneBook.addLast("Taylor");
        phoneBook.add(4, "Pat");
        System.out.println("List after additions: " + phoneBook);

        // Remove elements (Quiz yourself)
        phoneBook.remove("Pat");
        phoneBook.remove(2);
        phoneBook.removeFirst();
        phoneBook.removeLast();
        System.out.println("List after removals: " + phoneBook);
        
        // More operations!!!
        System.out.println("Contains Sam? " + phoneBook.contains("Sam"));
        System.out.println("Get size of the list: " + phoneBook.size());

        // First if statement practice
        if (!phoneBook.isEmpty()) {
            System.out.println("First in the list: " + phoneBook.getFirst());
        }

        phoneBook.clear();
        System.out.println("List after clearing: " + phoneBook);
    }
}