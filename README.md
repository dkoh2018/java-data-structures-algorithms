# DKO - Data Structures and Algorithms in Java

I started this mainly for myself but for others to learn data structures and algorithms. We'll be diving in with Java, so sit back, enjoy, and feel free to follow along. Try to grasp the logic behind each concept before jumping into coding.

FYI: I'll be using a VSCode on a Macbook (Apple Silicon chip).

## Table of Contents

- [Getting Started with Java](#getting-started-with-java)
- [Fundamentals of Data Structures](#fundamentals-of-data-structures)
  - [Big O-notation](#bigonotation)
  - [Arrays](#arrays)
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
  - [Special Topics in Algorithms](#special-topics-in-algorithms)
    - [Jump Search](#jump-search)
    - [Interpolation Search](#interpolation-search)
- [Consolidation and Advanced Studies](#consolidation-and-advanced-studies)
- [Resources](#resources)
- [Contributing](#contributing)

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
   public class HelloWorld {
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

**Scenario 1:** You have a **Nested Loop**, a loop nested within another loop. Despite achieving similar results, this pattern signifies a Big O notation of O(n^2). This complexity suggests that the time taken doubles with each additional element.

**Scenario 2:** Contrary to the first scenario, you have **two separate loops**, each iterating over your data. This case represents a Big O notation of O(n). This means that the runtime grows linearly and in direct proportion to the size of the input data set.

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

However, this is a bit messy as in, it's a ton of code. We want to make it os that we're as efficient with our
