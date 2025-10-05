# ☕ Java Practice Questions

A comprehensive repository of basic and advanced programming questions solved using the Java language. This collection is designed to showcase my problem-solving skills and mastery of core Java concepts, from fundamental data types to advanced Object-Oriented Programming.

---

## 📁 Module 1

Solutions for all the questions listed below can be found within the `Module_1` directory of this repository.

### 🏛️ Concepts of OOP

1.  Write a program to demonstrate **encapsulation** in Java.
2.  Create a program showing the use of **inheritance** and **polymorphism**.
3.  Explain and implement the concept of **abstraction** in Java using interfaces.
4.  Write a program to demonstrate **method overloading** and **method overriding**.
5.  Create a class hierarchy for animals that demonstrates polymorphism.
6.  Develop a program to implement **multiple inheritance** using interfaces.
7.  Write a Java program to showcase the use of `this` and `super` keywords.
8.  Demonstrate the concept of **constructors** in OOP with a program.
9.  Explain and implement the concept of **access modifiers** in Java.
10. Show an example of the `final` keyword for variables, methods, and classes.
11. Write a program that uses Java's `StringBuilder` for efficient string operations.
12. Write a program to demonstrate the **immutability** of the `String` class.

### 🔢 Data Types, Control Statements, and Identifiers

13. Write a program to declare variables of all **primitive data types** in Java and print their default values.
14. Implement a program to demonstrate the use of `if-else`, `switch`, and `for` loops.
15. Write a program to check if a number is **prime** using a `while` loop.
16. Create a program to calculate the **factorial** of a number using recursion.
17. Write a program to identify valid and invalid **identifiers** in Java.

### 🔲 Arrays

18. Write a program to find the largest and smallest numbers in an array.
19. Write a program to check if a given number is odd or even.
20. Write a program to find the largest of three numbers entered by the user.
21. Write a program to calculate the factorial of a given number using recursion.
22. Write a program to check if a given string or number is a **palindrome**.
23. Write a program to generate the first n terms of the **Fibonacci series**.
24. Write a program to check whether a given number is prime.
25. Write a program to find the sum of all elements in an array.
26. Implement a program to reverse the elements of an array.
27. Write a Java program to perform **matrix addition and multiplication**.
28. Create a program to sort an array using the **bubble sort** algorithm.
29. Write a program to demonstrate a **2D array** and print its elements.
30. Write a program to search for an element in a sorted array using the **binary search** algorithm.
31. Write a program to remove duplicate elements from an array.

### 🔣 Operators

32. Write a program to demonstrate the use of **arithmetic**, **relational**, and **logical** operators.
33. Create a program to show the difference between `==` and `equals()` for string comparison.
34. Write a program to illustrate the use of the **ternary operator**.
35. Implement a program to perform **bitwise operations** in Java.
36. Write a program to demonstrate **operator precedence** in Java.

### 🧱 Classes and Constructors

37. Write a program to create a class with multiple constructors (**constructor overloading**).
38. Implement a program to demonstrate the use of a **copy constructor** in Java.
39. Create a program that initializes class fields using a **parameterized constructor**.
40. Write a program to demonstrate the use of `static` and `non-static` methods.
41. Implement a **singleton class** in Java.

### 🧬 Inheritance and Method Overriding

42. Write a program to demonstrate **multilevel inheritance** in Java.
43. Create a program to show **method overriding** and the use of `super` to call the parent class method.
44. Implement an **abstract class** and override its methods in a subclass.
45. Write a program to demonstrate `final` classes and methods.
46. Create a program to show **run-time polymorphism** using dynamic method dispatch.

### 📝 String Class and Operations

47. Write a program to **reverse a string** without using built-in methods.
48. Implement a program to count the **frequency of characters** in a string.
49. Write a program to demonstrate the **immutability** of the `String` class.
50. Create a program to check if a given string is a **palindrome**.
51. Implement a program to **split a string** into words and print each word on a new line.

---

## 📁 Module 2

### 📦 Section 1: Defining, Implementing, and Importing Packages

1. Create a Java package `utilities` that contains a class `MathUtils` with a method `add(int a, int b)` to return the sum of two numbers. Demonstrate the use of this package in another class.
2. Define a package `shapes` containing an interface `Shape` with methods `double area()` and `double perimeter()`. Implement the interface in classes `Circle` and `Rectangle`.
3. Write a program to import classes from `java.util` and use `ArrayList` to store and display a list of integers.

### 🔁 Section 2: Interfaces — Functional Interface and Lambda Expression

4. Define a functional interface `Calculator` with a method `int compute(int a, int b)`. Use a lambda expression to provide implementation for addition, subtraction, and multiplication.
5. Write a Java program to sort a list of strings in descending order using a lambda expression.
6. Implement a method reference in a program to find the square of a number using a static method.

### ❗ Section 3: Errors and Exceptions — Exception Handling

7. Write a program that demonstrates the difference between `try-catch` and `try-catch-finally` blocks by dividing two numbers and handling `ArithmeticException`.
8. Create a custom exception `InvalidAgeException` that is thrown when a user's age is less than 18. Write a program to demonstrate its use.

### ⚠️ Built-in and Custom Exceptions

9. Create a custom exception `InvalidAgeException` that is thrown when a user's age is less than 18. Handle the exception and log the error to a file using `java.util.logging`.
10. Demonstrate the use of `throw` and `throws` keywords in a program that calculates the factorial of a number. Throw an exception if the input number is negative.

## 📁 Module 3

### ⚙️ Lab_Work_Mod_3_Set2 — Thread Synchronization and Concurrency

1. Synchronized Method: Create a Java program where two threads try to update the same bank account balance. Use synchronization to ensure the balance is updated correctly and avoid race conditions.
2. Synchronized Block: Modify the above program (bank account example) to use a synchronized block instead of a synchronized method.
3. Thread Deadlock: Write a program that simulates a deadlock condition. Create two threads that attempt to lock two different resources and cause a deadlock.
4. Using wait(), notify(), and notifyAll(): Implement a producer-consumer scenario where one thread (producer) produces data and another thread (consumer) consumes it. Use the wait() and notify() methods for synchronization.
5. Stopping a Thread: Write a program that safely stops a thread using a flag. The thread should print numbers from 1 to 100, and the program should be able to stop the thread by setting the flag to false.

### 🧵 Lab_Work_Mod_3_Set3 — I/O Streams, File Handling, and Packages

1. Write a program that reads a text file using the FileInputStream and prints the contents to the console.
2. Create a program that writes a string into a file using the FileOutputStream. Ensure that the program writes the string "Java I/O Streams Example" to a file named output.txt.
3. Read string and integer values from the command prompt and process them using I/O streams.
4. Write a program that demonstrates the use of Math.random(), Math.abs(), and Math.pow() from the java.lang package.
5. Regular Expressions: Create a program that uses the Pattern and Matcher classes from the java.util.regex package to check if a given string is a valid email address.

## 🧩 Module 3 — Assignment: Advanced Threading, Locking, and File I/O

### 🧠 Thread Concepts and Implementation

1. Create a thread by extending the Thread class that prints even numbers from 2 to 20 with a 500ms delay between each number.
2. Create a thread by implementing the Runnable interface that takes a string "MULTITHREADING" and prints its characters in reverse order one by one.
3. Thread Sleep Method: Create a program that creates two threads. The first thread should print "Thread 1" every 1 second, and the second thread should print "Thread 2" every 2 seconds.
4. Countdown Timer: One thread prints a countdown from 10 to 1 (1-second delay), while another thread simultaneously prints "Tick..." every half a second.
5. Thread Naming and Priority: Create three threads — "Worker-1", "Worker-2", and "Worker-3". Assign different priorities and print their execution order.
6. Daemon Threads: Write a Java program where a daemon thread continuously prints "Auto-Save in progress..." every 3 seconds while the main thread performs file processing.

### 🔒 Thread Synchronization

1. Synchronized Method: Ticket booking system where multiple users (threads) attempt to book tickets simultaneously. Use synchronization to prevent overselling.
2. Synchronized Block: Inventory management system where multiple threads decrease stock count. Use synchronized blocks for safe stock updates.
3. Deadlock Example: Simulate a Dining Philosophers problem where two philosophers try to pick up chopsticks (resources) and create a deadlock.
4. Using wait() and notify():

- Producer-consumer synchronization example.
- Two threads print numbers from 1–20 alternately (odd/even) using wait() and notify().

1. Stopping a Thread: Simulate a file download that prints "Downloading chunk X" and stops gracefully when a stop flag is set to false.

### 🔐 Lock Interface

1. Use the ReentrantLock class to create a safe counter incremented by multiple threads. Compare results with a non-locked version.
2. Create two threads acquiring two locks (lock1 and lock2) in opposite order to cause a deadlock. Then fix it using tryLock() with a timeout.

### 📂 I/O Streams — Byte and Character Streams

1. Byte Stream: Read a file using FileInputStream and print its contents.
2. Byte Stream Write: Write "Java I/O Streams Example" to output.txt using FileOutputStream.
3. Character Stream Read: Read a file using FileReader and print its contents.
4. Character Stream Write: Write a string to example.txt using FileWriter.
5. Buffered I/O: Improve performance using BufferedReader and BufferedWriter.

### 🗃️ File Handling

1. File Existence Check: Verify if a file exists. If not, create it using the File class.
2. List All Files: List all files in a user-specified directory.
3. Copy File: Copy the contents of one file to another using FileInputStream and FileOutputStream.
4. Delete File: Delete a file using the File class.
5. Random Access File: Use RandomAccessFile to write and read specific positions in a file.

### 📦 Exploring Java Packages

1. java.lang Package: Demonstrate Math.random(), Math.abs(), and Math.pow().
2. java.util Package: Use Date and Calendar to display the current date and time.
3. java.util.regex Package: Validate an email using Pattern and Matcher.

## 📁 Module 4

### Lab_Work_Mod_4_set1

1. Create a user-defined generic class Box<T> with methods addItem(T item) and getItem(). Demonstrate its usage with String and Integer types.
2. Write a generic method swapElements that swaps two elements in an array. Demonstrate its usage with different data types.
3. Write a program to iterate over a List of integers using:
   a. A simple for loop
   b. An enhanced for loop
   c. A while loop with an Iterator
4. Create a List of strings and perform the following operations:
   a. Add elements to the list.
   b. Remove an element by value and index.
   c. Replace an element at a specific index.
   d. Print the list after each operation.
5. Write a program to sort an ArrayList of strings alphabetically and reverse alphabetically.
6. Write a program to sort a list of custom objects (e.g., Student with name and marks) using a Comparator.

### Lab_Work_Mod_4_set2

1. Find the Maximum Product Subarray: Given an integer array nums, find the contiguous subarray (containing at least one number) with the largest product.
   Example:
   a. Input: nums = [2,3,-2,4]
   b. Output: 6 (subarray [2,3])
2. Reverse a Linked List
   Write a function to reverse a singly linked list in place.
   Example: 1 → 2 → 3 → 4 → 4 → 3 → 2 → 1
3. Write a program to demonstrate the use of TreeMap for sorting keys.
4. Write a program to create a HashMap of employee IDs and names. Perform the following operations:
   a. Add new key-value pairs.
   b. Check if a key exists.
   c. Iterate through the map using:
   d. KeySet
   e. EntrySet
5. Write a program to demonstrate the sorted order of keys in TreeMap by adding unsorted key-value pairs.
6. Write a program to show the difference between HashMap and LinkedHashMap in terms of iteration order

## Module 4 - Assignment

### Generics

1. What is the purpose of generics in Java, and how do they improve type safety and code reusability?
2. Explain the syntax for creating a user-defined generic class in Java. Provide an example.
3. How do bounded type parameters work in generics? Write a generic class that accepts only subclasses of Number.
4. What is the difference between ? extends T and ? super T in generics? Provide an example of when to use each.
5. How do raw types differ from parameterized types in generics, and why should raw types be avoided?
6. Write a generic class Pair<K, V> that holds two values of any types, K and V. Include methods to get and set the values.
7. Create a user-defined generic class Box<T> with methods addItem(T item) and getItem(). Demonstrate its usage with String and Integer types.
8. Write a generic method swapElements that swaps two elements in an array. Demonstrate its usage with different data types.
9. Develop a user-defined generic class Stack<T> that provides standard stack operations like push(T item), pop(), and peek(). Demonstrate with integers and strings.
10. Implement a generic class MinMaxFinder<T extends Comparable<T>> that provides methods findMin() and findMax() to find the minimum and maximum elements in a list. Demonstrate it with a list of integers and strings.

### Java.util package and collection framework

1. What is the java.util package, and why is it essential in Java programming?
2. What are the key features of the Collection Framework in java.util?
3. Explain the differences between Collection and Collections in java.util.
4. What is the role of the Iterator interface in the java.util package?
5. What is the purpose of the Comparator and Comparable interfaces in the java.util package?
6. What are the key interfaces in the Java Collection Framework, and how are they related?
7. What is the difference between Collection and Map interfaces in Java?
8. Explain the differences between Set, List, and Queue in the Collection Framework.
9. What is the significance of the Iterable interface, and how is it used in the Collection Framework?
10. What are the benefits of using the Collection Framework over arrays?
11. Write a program to iterate over a List of integers using:
    a. A simple for loop
    b. An enhanced for loop
    c. A while loop with an Iterator
12. Write a generic method to print all elements of any Collection (e.g., List, Set, Queue).

### List Interface

1. What is the List interface, and how does it differ from the Set interface?
2. What is the difference between ArrayList and LinkedList in terms of performance and usage?
3. Write a program to demonstrate the use of ArrayList for storing and iterating over elements.
4. What is the role of the Vector class, and how does it differ from ArrayList?
5. How is the Stack class implemented, and how does it relate to the List interface?
6. Create a List of strings and perform the following operations:
   a. Add elements to the list.
   b. Remove an element by value and index.
   c. Replace an element at a specific index.
   d. Print the list after each operation.
7. Write a program to compare the performance of ArrayList and LinkedList for:
   a. Adding elements at the beginning.
   b. Removing elements from the middle.
   c. Iterating through the list.
8. Write a program to sort an ArrayList of strings alphabetically and reverse alphabetically.

### Set Interface

1. What is the Set interface, and how is it different from List?
2. What is the difference between HashSet, LinkedHashSet, and TreeSet in Java?
3. Write a program to demonstrate the use of TreeSet for storing sorted elements.
4. How does HashSet handle duplicate elements? Explain with an example.
5. What is the significance of equals() and hashCode() methods in HashSet?
6. Write a program to demonstrate the uniqueness property of HashSet by attempting to add duplicate elements.
7. Create a TreeSet of integers and perform the following operations:
   a. Add elements to the set.
   b. Find the smallest and largest elements.
   c. Remove a specific element.
8. Write a program to iterate over a LinkedHashSet and explain its order-preserving property.

### Map Interface

1. What is the Map interface in Java, and how is it different from Collection?
2. What is the difference between HashMap, LinkedHashMap, and TreeMap?
3. How does HashMap handle collisions?
4. Write a program to demonstrate the use of TreeMap for sorting keys.
5. What is the difference between Hashtable and HashMap? Why is Hashtable considered legacy?
6. Write a program to create a HashMap of employee IDs and names. Perform the following operations:
   a. Add new key-value pairs.
   b. Check if a key exists.
   c. Iterate through the map using:
   i. KeySet
   ii. EntrySet
7. Write a program to demonstrate the sorted order of keys in TreeMap by adding unsorted key-value pairs.
8. Write a program to show the difference between HashMap and LinkedHashMap in terms of iteration order.

### Queue and stack

1. Implement a simple program using Queue (with LinkedList) to simulate a ticket booking system.
2. Use a PriorityQueue to store a list of tasks with priorities. Add tasks, remove the highest-priority task, and print the queue.
3. Write a program to implement a Stack using the Stack class. Perform operations like push, pop, peek, and check if it is empty.
4. Implement a deque using the ArrayDeque class. Perform operations like:
   a. Add elements at both ends.
   b. Remove elements from both ends.
   c. Peek at both ends.
5. Write a program to check if a string is a palindrome using a Deque.

### Specialized Classes

1. What is the purpose of the PriorityQueue class in Java?
2. How is the Deque interface different from the Queue interface?
3. What is the difference between BlockingQueue and PriorityQueue?
4. Write a program to implement a simple Queue using the LinkedList class.
5. What is the role of WeakHashMap in Java, and how is it different from HashMap?

### Concurrency and Thread-Safety

1. How is Vector different from ArrayList in terms of thread safety?
2. Write a program to demonstrate the thread-safe nature of Vector by adding elements to it from multiple threads.
3. What is the role of ConcurrentHashMap in Java, and how does it achieve thread safety?
4. Create a ConcurrentHashMap and demonstrate how it handles concurrent modifications.
5. What are the differences between CopyOnWriteArrayList and ArrayList?
6. Write a program using CopyOnWriteArrayList to iterate and modify a list safely in a multithreaded environment.
7. What is the difference between synchronizedCollection and ConcurrentHashMap?

### Utility Methods in Collections Class

1. What are some commonly used methods in the Collections utility class?
2. Write a program to shuffle and sort an ArrayList using methods from the Collections class.
3. How can you make a collection thread-safe using the Collections class?
4. Create an unmodifiable List using Collections.unmodifiableList() and show what happens when you try to modify it.
5. Write a program to perform a binary search on a List using the Collections.binarySearch() method.
6. Write a program to find the frequency of elements in a list using Collections.frequency().

### Custom Comparator

1. Write a program to sort a list of custom objects (e.g., Student with name and marks) using a Comparator.
2. Write a program to sort a Map by its values using a custom Comparator.

### Practical Use Cases

1. Create a class LruCache<K, V> using LinkedHashMap to implement an LRU (Least Recently Used) cache.
2. Implement a basic to-do list application using ArrayList to store tasks. Add functionality to add, remove, and display tasks.
3. Write a program to count the frequency of characters in a string using a HashMap.
4. Create a program to store students’ grades in a TreeMap, with student names as keys and grades as values. Allow adding, removing, and querying grades.
5. Write a program to merge two PriorityQueue objects and sort the resulting queue.

### Advanced Questions

1. Create a generic MultiMap<K, V> class that stores multiple values for a single key using a HashMap<K, List<V>>.
2. Write a program to implement a simple banking system using Map to store customer IDs and their account balances.
3. Use a WeakHashMap to demonstrate how entries are garbage-collected when keys are no longer strongly referenced.
4. Create a program to implement a book catalog system using HashMap, where book titles are the keys and author names are the values. Allow searching by title.
5. Write a program to store a list of products and their prices in a TreeMap and display the products in sorted order by name.
