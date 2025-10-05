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
