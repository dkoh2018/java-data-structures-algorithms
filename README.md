# DKO - Data Structures and Algorithms in Java

**I started this mainly for myself but for others to learn data structures and algorithms. We'll be diving in with Java, so sit back, enjoy, and feel free to follow along (you probably should).**

## Why follow along

Learning to code can be challenging. I remember feeling the need to know everything. You know what I mean - **The Tutorial Hell Trap**. And while a broad understanding is helpful, I often learned the most when diving into projects that intrigued me. However, it wasn't smooth sailing. In the beginning, I struggled because I didn't fully grasp the importance of DSA. Correction - I didn't know what DSA was. "Projects" after unfinished projects, I struggled to apply basic methods of programming.

Ever wondered about these situations?

- How do e-commerce applications quickly find a product by its ID? Could using hash tables be more efficient than arrays?
- Ever thought about how social networks like Facebook or LinkedIn manage user connections? What role do graph data structures and traversal algorithms play in finding mutual friends?
- Why do websites load faster on your second visit? Could this be due to efficient caching using doubly linked lists or hash maps?

**You get the point. We'll explore various concepts, but remember, it's more about gradually mastering these concepts over time.**

---

_I guarantee making programs will be much more fun as you learn more concepts._

### Tips:

1. **Engage actively with the material.** Don't just copy codes because that doesn't do ANYTHING for you; use ChatGPT / Google to challenge yourself with questions and ask for "real world" examples to apply DSA concepts. AI is a game-changer buddy.
2. **Remember, learning is a marathon, not a sprint.** Set realistic goals and pace yourself. You'll be learning fast at first but don't expect to be learning 8 lessons a day. It's going to slow down so don't be disappointed. Even 1-2 concepts/day is FINE!
3. **Let's stop talking and start doing!**

FYI: I'll be using VSCode on a Macbook (Apple Silicon chip).

## Table of Contents

- [**Introduction to Java**](#introduction-to-java)
  - [**Setting up Java Environment**](#setting-up-java-environment)
  - [**Write Your First Java Program**](#write-your-first-java-program)
- [**Fundamentals of Data Structures**](#fundamentals-of-data-structures)
  - [**Big O Notation (MUST KNOW)**](#big-o-notation-must-know)
  - [**Arrays**](#arrays)
  - [**Loops**](#loops)
  - [**Linked Lists**](#linked-lists)
  - [**Stacks (LIFO)**](#stacks-lifo)
  - [**Queues (FIFO)**](#queues-fifo)
- [**Basic Algorithms**](#basic-algorithms)
  - [**Searching Algorithms**](#searching-algorithms)
    - [**Linear Search**](#linear-search)
    - [**Binary Search**](#binary-search)
- [**Sorting Algorithms**](#sorting-algorithms)
  - [**Bubble Sort**](#bubble-sort)
  - [**Selection Sort**](#selection-sort)
  - [**Insertion Sort**](#insertion-sort)
- [**Intermediate Data Structures**](#intermediate-data-structures)
  - [**Trees**](#trees)
  - [**Graphs**](#graphs)
  - [**Heaps**](#heaps)
  - [**Hash Tables**](#hash-tables)
- [**Advanced Sorting Algorithms**](#advanced-sorting-algorithms)
  - [**Merge Sort**](#merge-sort)
  - [**Quick Sort**](#quick-sort)
  - [**Heap Sort**](#heap-sort)
- [**Advanced Concepts**](#advanced-concepts)
  - [**Recursion**](#recursion)
  - [**Divide and Conquer**](#divide-and-conquer)

## **Introduction to Java**

_I chose Java because of its unique balance between performance and usability. Unlike C, Java offers a more forgiving and intuitive programming environment, which is excellent for beginners. But honestly, I'm using Java because I wanna. You think it's a joke, huh?_

### **Setting up Java Environment**

- **Download Java/JDK**: Visit the [**Official Java Website**](https://www.oracle.com/java/technologies/downloads/#java11-mac) to download the Java Development Kit (JDK).

_Think of Java like the ABCs of computer language. It's what we use to tell the computer what to do.
The JDK? That's your toolbox. It has all the tools (like a compiler and libraries) you need to start creating with Java._

### Write Your First Java Program

1. Begin by confirming your current directory in [Visual Studio Code](https://code.visualstudio.com/). This can be done by opening the terminal (View > Terminal) and typing the command `pwd` to display your current directory.

   ```shell
   >> pwd
   ```

   - If the displayed directory is where you want your Java file to be located, **you can move to the next step**.
   - If you want to change your directory, use the `cd` command followed by the path to your preferred directory.

     ```shell
     >> cd ../../path-to-your-preferred-directory
     ```

2. In your directory, initiate a new Java file named `HelloWorld.java`. You can use the `code` command, which opens the file in a new Visual Studio Code tab.

   ```shell
   >> code HelloWorld.java
   ```

3. Once `HelloWorld.java` is opened, input the following Java code then save `(Cmd + S)`:

   ```java
   // This is how you create a comment
   // Main Class (*** make sure HelloWorld matches your file name HelloWorld.java ***)
   public class HelloWorld {

       // Driver Code
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
   ```

4. To run this script, either:

   - Click on the "Run Java" button (top right, resembles a play button).
   - Or, if you prefer using shell commands (recommended), make sure to save the file before running it:

     ```shell
     >> java HelloWorld.java
     ```

   You should see the output "Hello, World!".

Visit [Learn Java Online](https://www.learnjavaonline.org/) for more Java Basics since I'll be covering DSA here, instead.

Alright, let's now dive in.

## Fundamentals of Data Structures

Data structures are fundamental in programming, transcending language barriers. While we'll focus on Java, the concepts apply universally. Once you grasp data structures, you can easily adapt this knowledge to other programming languages.

Here's why:

- **Language-Independent Logic**: Understanding data structures in one language eases their implementation in others, boosting your flexibility in diverse programming environments.
- **Organization of Data**: Data structures allow for systematic data organization and management, crucial for clean and efficient coding.
- **Efficiency**: The selection of the correct data structure can significantly improve algorithm performance since different structures excel in different tasks.
- **Problem Solving**: Knowledge of data structures aides in framing problems better, leading to more intuitive and clear solutions.

### Big O-notation (MUST KNOW)

Before we dive into writing actual code, it's crucial for us to familiarize ourselves with **Big O Notation**. By understanding this concept, we can ensure that our codes are not only elegantly designed but also memory and processing efficient.

The efficiency of an algorithm often comes down to how its running time increases as we increase the input size, which is where the Big O notation comes into play. It gives us a high-level understanding of the time complexity of an algorithm.

Let's compare 2 situations:

**Scenario 1:** You have a **Nested Loop**, a loop nested within another loop. This pattern signifies a Big O notation of O(n^2). This complexity suggests that the time taken doubles with each additional element.

**Scenario 2:** Contrary to the first scenario, you have **two separate loops**, each iterating over your data. Despite achieving similar results, this case represents a Big O notation of O(n). This means that the runtime grows linearly and in direct proportion to the size of the input data set.

Quite clearly, using two separate loops would provide a faster runtime.

![Big O-notation chart](https://miro.medium.com/v2/resize:fit:4800/format:webp/1*5ZLci3SuR0zM_QlZOADv8Q.jpeg)

To summarize, here are different types of logical complexities represented by Big O notation:

- Logarithmic algorithm – **O(log n)**: Runtime grows logarithmically with n.
- Linear algorithm – **O(n)**: Runtime grows in direct proportion to n.
- Superlinear algorithm – **O(n log n)**: Runtime grows in proportion to n but slightly faster due to the additional log n factor.
- Polynomial algorithm – **O(n^c)**: Runtime grows at a rate of n raised to the power of any constant c.
- Exponential algorithm – **O(c^n)**: Runtime grows exponentially with n, and doubles with each addition to the input data set.
- Factorial algorithm – **O(n!)**: Runtime grows the fastest and can quickly become unusable for even small values of n.

### Arrays

Arrays in Java are a fundamental data structure characterized by the following key features:

- **Contiguous Memory**: Arrays store elements next to each other, allowing effective element access and manipulation.
- **Fixed Size**: The count of elements an array can store is set upon creation and can't change.
- **Homogeneity**: All elements in an array share the same data type.
- **Direct Access**: Arrays use indices to provide immediate access to elements, which speeds up read operations.
- **Efficient Storage**: Arrays are compact and suitable for storing large sets of similar data, optimizing memory use.

Here's an example:

```java
class ArrayExample {
    public static void main(String[] args) {

        // declare array of integers then allocate memory for 10 integers
        int[] Array;
        Array = new int[10];

        // initialize first element[0] then second element[1] and so on...
        Array[0] = 100;
        Array[1] = 200;
        Array[2] = 300;
        Array[3] = 400;
        Array[4] = 500;
        Array[5] = 600;
        Array[6] = 700;
        Array[7] = 800;
        Array[8] = 900;
        Array[9] = 1000;

        // Print
        System.out.println("Element at index 0: " + Array[0]);
        System.out.println("Element at index 1: " + Array[1]);
        System.out.println("Element at index 2: " + Array[2]);
        System.out.println("Element at index 3: " + Array[3]);
        System.out.println("Element at index 4: " + Array[4]);
        System.out.println("Element at index 5: " + Array[5]);
        System.out.println("Element at index 6: " + Array[6]);
        System.out.println("Element at index 7: " + Array[7]);
        System.out.println("Element at index 8: " + Array[8]);
        System.out.println("Element at index 9: " + Array[9]);
    }
}
```

Output:

```
Element at index 0: 100
Element at index 1: 200
Element at index 2: 300
Element at index 3: 400
Element at index 4: 500
Element at index 5: 600
Element at index 6: 700
Element at index 7: 800
Element at index 8: 900
Element at index 9: 1000
```

However, this current code is a bit inefficient and unnecessarily cluttered. We could avoid wasting time and tidy up our code by refraining from writing repetitive lines. This brings us to our next valuable lesson - Loops.

### Loops

Mastering loops is **fundamental** to thinking and programming efficiently (like a lot...). Doing so saves time as loops handle repetitive tasks flexibly without the need for lengthy copy-and-paste code. With that in mind, we're going to quickly explore three types of loops:

1. For loops
2. While loops

Do some digging on loops when you get a chance; there's quite a few variations out there: Do-While Loops, Infinite Loops, Loops with 'else' clauses, Comprehension Loops, Iterator Loops, Generator Loops, Nested Loops, and more. The rabbit hole goes deep so have fun exploring.

Now, coming to the examples:

Make your 'ArrayExample' class and driver code. This will initialize and interact with an array. I've prepared an integer array with ten slots reserved, and in the commented section, 'Insert Loop codes here'.

```java
public class ArrayExample {
    public static void main(String[] args) {
        int[] Array;
        Array = new int[10];

        // <Insert Loop codes here>
    }
}
```

#### For Loops

```java
// Initializes each element to a multiple of 100 and then print its index and value
for (int i = 0; i < Array.length; i++) {
    Array[i] = (i + 1) * 100;
    System.out.println("Element at index "+i+": "+Array[i]);
}
```

#### While Loops

```java
// Populate each element with a multiple of 100 and display its index and value
int i = 0;
while (i < Array.length) {
    Array[i] = (i+1) * 100;
    System.out.println("Element at index "+i+": "+Array[i]);
    i++;
}
```

Both Outputs:

```
Element at index 0: 100
Element at index 1: 200
Element at index 2: 300
Element at index 3: 400
Element at index 4: 500
Element at index 5: 600
Element at index 6: 700
Element at index 7: 800
Element at index 8: 900
Element at index 9: 1000
```

Although arrays are powerful in their simplicity and direct access, they come with limitations, particularly in their fixed size and the complexity involved in inserting or deleting elements. To address these limitations, let's explore another fundamental data structure: Linked Lists.

### Linked Lists

Linked Lists, as dynamic data structures, differ significantly from arrays. Key highlights include:

- **Dynamic Size**: They can expand or contract, offering flexibility.
- **Easy Modifications**: Insertions and deletions are simpler, without needing to shift other elements.
- **Non-Contiguous Storage**: Elements ('nodes') are linked via pointers and can reside anywhere in memory.

On the flip side:

- **Increased Memory**: Nodes consume extra memory due to data and pointer storage.
- **Sequential Access**: Direct element access is not possible; traversal from the start is required.

So, we've looked at the characteristics of linked lists, but what does this all mean in practice? Imagine a toy train set.

**Arrays** are like a train with tightly coupled cars. Adding or removing cars (or elements) in the middle is a pain in the butt - you have to disconnect and move all subsequent cars. It's efficient when working with data en masse, but individual modifications can be taxing.

```
Before Insertion:
+---+---+---+---+
| A | B | C | D |
+---+---+---+---+

Inserting 'X' at index 2:
+---+---+---+---+---+
| A | B | X | C | D |
+---+---+---+---+---+
            →
Elements shifted right
```

```
Before Deletion:
+---+---+---+---+
| A | B | C | D |
+---+---+---+---+

Deleting 'B':
+---+---+---+
| A | C | D |
+---+---+---+
    ←
Elements shifted left
```

**Linked Lists**, on the other hand, function like a train with easily detachable cars. Each car (or Node) hooks onto the next, allowing us to seamlessly insert or remove cars in the middle without disrupting the entire setup. This offers greater ease and efficiency when changing single elements, making Linked Lists a more flexible alternative for specific tasks.

```
Before Insertion:
+---+    +---+    +---+
| A | -> | B | -> | D |
+---+    +---+    +---+

Inserting 'C' after 'B':
+---+    +---+    +---+    +---+
| A | -> | B | -> | C | -> | D |
+---+    +---+    +---+    +---+
                    ↑
         Only pointers updated
```

```
Before Deletion:
+---+    +---+    +---+
| A | -> | B | -> | C |
+---+    +---+    +---+

Deleting 'B':
+---+             +---+
| A | ----------> | C |
+---+             +---+
           ↑
   'B' is bypassed
```

This simplicity and flexibility are exactly why we use linked lists in programming when we expect to add or remove a lot of items.

So how do we create a linked list in Java? That's where Java's `import java.util.*` package comes in handy. It's like a toolbox full of helpful tools — and one of those tools is the LinkedList class. Instead of making your own gear, you just ask to use this. This saves you time, and you know it's going to work well because it’s been tried and tested.

I suggest you skimming through [Package `java.util`](https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html) to get a sense of the rich open-source resources at your disposal.

Anyways, let's get straight into Linked Lists:

```java
// Skim, then practice. Make your own examples

// Add end = .add()
// Add beginning = .addFirst()
// Add last = .addLast()
// Add specific = .add(2, "Pat")
// Remove first occurrence = .remove()
// Remove specific = .remove(2)
// Remove first = .removeFirst()
// Remove last = .removeLast()
// Contains an element = .contains()
// Get size of list = .size()
// Check if empty = .isEmpty()
// Get first non-empty element = .getFirst()

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String args[]) {
        LinkedList<String> phoneBook = new LinkedList<String>();


        phoneBook.add("Pat");
        phoneBook.add("Charlie");
        phoneBook.add("Sam");
        phoneBook.addFirst("Alex");
        phoneBook.addLast("Taylor");
        phoneBook.add(4, "Pat");
        System.out.println("List after additions: " + phoneBook);

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

```

Output in logical order:

```
List after additions: [Alex, Pat, Charlie, Sam, Pat, Taylor]
List after removals: [Charlie, Pat]
Contains Sam? false
Get size of the list: 2
First in the list: Charlie
List after clearing: []
```

Keep in mind, Linked Lists are good for implementing basic **Searching Algorithms** like **Linear Search**, but are not very efficient for **Sorting Algorithms**, since sorting algorithms require a lot of back-and-forth traversal and linked lists do not support indexing. However, linked lists are used in some recursive sorting algorithms like **Merge Sort**

Now let's move on.

### Stacks (LIFO)

Think of a stack like a stack of books. Books are added to the top and taken from the top. In computer science, we call this LIFO, Last In, First Out.

Here's what that looks like visually:

```
Initial Stack:
+---+
| D | <- Top
+---+
| C |
+---+
| B |
+---+
| A |
+---+
Bottom
```

When you add (push) a new book 'E' to the stack:

```
Stack.push("E"):
+---+
| E | <- Top (Newly added)
+---+
| D |
+---+
| C |
+---+
| B |
+---+
| A |
+---+
Bottom
```

When you take (pop) a plate off the stack:

```
Stack.pop("E")
+---+
| D | <- Top (Now at the top after 'E' was removed)
+---+
| C |
+---+
| B |
+---+
| A |
+---+
Bottom
```

Stacks are again part of the `java.util` package, similar to LinkedLists. Let's see how we code a Stack:

```java
// Skim, then practice. Make your own examples

// Stack add = .push()
// Stack remove = .pop()
// Stack empty? = .empty()
// Stack View top element = .peek()
// Stack search element = .search(Object o)
// Stack size = .size()

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("Stack: " + stack);
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Is stack empty? " + stack.empty());

        int secondElement = stack.search("Second");
        System.out.println("Position of 'Second': " + secondElement);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Element removed (pop): " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}

```

Output:

```
Stack: [First, Second, Third]
Top element (peek): Third
Is stack empty? false
Position of 'Second': 2
Stack size: 3
Element removed (pop): Third
Stack after pop: [First, Second]
```

While linked lists can handle basic Searching Algorithms like Linear Search and are particularly useful in recursive Sorting Algorithms like Merge Sort, stacks serve a different purpose.

Comparing stacks to linked lists is like comparing a straight path to a two-way street. While linked lists give you the freedom to hop on and off at any point, stacks are all about the discipline of order: the last thing you put in is always the first one out (LIFO principle) which doesn't allow for random access in the way linked lists do.

However, stacks are incredibly useful for managing function calls in recursion, for parsing expressions in compilers, and for implementing depth-first search (DFS) algorithms in graph processing. They excel in environments where the most recent data needs to be accessed first, contrasting with linked lists that allow sequential access and are flexible with insertions and deletions at any point.

### Queues (FIFO)

Queues operate on the First In, First Out (FIFO) principle. Think of a line of customers waiting to check out at a grocery store. You stand in line from the back and you go as you came. Let's walk through the primary operations of a queue with a simple example:

Imagine a queue starting with three elements: A, B, and C, with A being the first one in line (at the Front) and C the last (at the Back).

```
Initial Queue:

            +---+    +---+    +---+
(<- Front)  | A | -> | B | -> | C | (<- Back)
            +---+    +---+    +---+
```

Next, we'll add 'D' to our queue. The enqueue operation adds 'D' to the back of the line, maintaining our order.

```
Enqueue 'D' (add 'D' - from back):

            +---+    +---+    +---+    +---+
(<- Front)  | A | -> | B | -> | C | -> | D | (<- Back)
            +---+    +---+    +---+    +---+
```

Now, we'll remove the first element 'A' from the front of the queue. In our case, 'A' will leave the queue, making 'B' the new front element.

```
Dequeue (remove 'A' - first out) (NOT Deque):

            +---+    +---+    +---+
(<- Front)  | B | -> | C | -> | D | (<- Back)
            +---+    +---+    +---+
```

This demonstrates the core functionality of a queue, showcasing how it manages elements in a sequential, orderly fashion. Think of customer service, traffic systems, print queues, and restaurant order management.

Keep in mind, we have to import LinkedList and Queue because we use LinkedList as an implementation of the Queue interface to demonstrate Queue functionality.

In simpler terms, this means that while Queue outlines the rules for how a queue should behave, LinkedList provides the actual mechanics and storage to make the queue work. LinkedList is particularly well-suited for this because it allows for efficient insertion and removal of elements at both ends, which is essential for maintaining the FIFO (First In, First Out) principle of queue operations.

So moving onto FIFO:

```java
import java.util.LinkedList;
import java.util.Queue;

// Queue add = .offer()
// Queue remove = .poll()
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Enqueue: Add elements A, B, C, D
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        System.out.println("Queue after enqueues: " + queue);

        // Dequeue: Removing the front element
        String dequeuedElement = queue.poll();
        System.out.println("Dequeued element: " + dequeuedElement);
        System.out.println("Queue after dequeue: " + queue);
    }
}
```

Output:

```
Queue after enqueues: [A, B, C, D]
Dequeued element: A
Queue after dequeue: [B, C, D]
```
