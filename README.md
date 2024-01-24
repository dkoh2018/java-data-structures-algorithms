# DKO - Data Structures and Algorithms in Java

I started this mainly for myself but for others to learn data structures and algorithms. We'll be diving in with Java, so sit back, enjoy, and feel free to follow along.

FYI: I'll be using VSCode on a Macbook (Apple Silicon chip).

## Table of Contents

- [Introduction to Java](#getting-started-with-java)
  - [Setting up Java Environment](#settingupjavaenvironmnet)
  - [Write Your First Java Program](#WriteYourFirstJavaProgram)
- [Fundamentals of Data Structures](#fundamentals-of-data-structures)
  - [Big O-notation](#bigonotation)
  - [Arrays](#arrays)
  - [Loops](#loops)
  - [Linked Lists](#linked-lists)
  - [Stacks](#stacks)
  - [Queues](#queues)
- [Basic Algorithms](#basic-algorithms)
  - [Searching Algorithms](#searching-algorithms)
    - [Linear Search](#linear-search)
    - [Binary Search](#binary-search)
- [Sorting Algorithms](#sorting-algorithms)
  - [Bubble Sort](#bubble-sort)
  - [Selection Sort](#selection-sort)
  - [Insertion Sort](#insertion-sort)
- [Intermediate Data Structures](#intermediate-data-structures)
  - [Trees](#trees)
  - [Graphs](#graphs)
  - [Heaps](#heaps)
  - [Hash Tables](#hash-tables)
- [Advanced Sorting Algorithms](#advanced-sorting-algorithms)
  - [Merge Sort](#merge-sort)
  - [Quick Sort](#quick-sort)
  - [Heap Sort](#heap-sort)
- [Advanced Concepts](#advanced-concepts)
  - [Recursion](#recursion)
  - [Divide and Conquer](#divide-and-conquer)

## Introduction to Java

I chose Java as the language for this course because of its unique balance between performance and usability. Unlike C, Java offers a more forgiving and intuitive programming environment, which is excellent for beginners.

### Setting up Java Environment

- **Download Java/JDK**: Visit the [Official Java Website](https://www.oracle.com/java/technologies/downloads/#java11-mac) to download the Java Development Kit (JDK).

Think of Java like the ABCs of computer language. It's what we use to tell the computer what to do.
The JDK? That's your toolbox. It has all the tools (like a compiler and libraries) you need to start creating with Java.

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
   // Main Class
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

Set up an 'ArrayExample' class. This will initialize and interact with an array. I've prepared an integer array with ten slots reserved, and in the commented section, 'Insert Loop codes here'.

```java
class ArrayExample {
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
// import LinkedList
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String args[]) {
        // Create LinkedList of String type
        LinkedList<String> ll = new LinkedList<String>();

        // add elements
        friendsList.add("Charlie");
        friendsList.add("Sam");
        friendsList.addFirst("Alex");
        friendsList.addLast("Taylor");
        friendsList.add(2, "Pat");

        // remove elements
        friendsList.remove("Pat");
        friendsList.remove(2);
        friendsList.removeFirst();
        friendsList.removeLast();

    }
}
```

Output in logical order:

```
[Charlie]
[Charlie, Sam]
[Alex, Charlie, Sam]
[Alex, Charlie, Sam, Taylor]
[Alex, Charlie, Pat, Sam, Taylor]
[Alex, Charlie, Sam, Taylor]
[Alex, Charlie, Taylor]
[Charlie, Taylor]
[Charlie]
```
