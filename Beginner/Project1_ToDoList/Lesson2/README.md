# Lesson 2: Basic Syntax and Data Types

In this lesson, we will explore the fundamental syntax of Java and the various data types available in the language. Understanding these concepts is essential as they form the building blocks of Java programming.

## Objectives
- Learn about the structure of a Java program.
- Understand the different data types in Java.
- Get familiar with variables and constants.

## Structure of a Java Program
A basic Java program consists of the following components:
1. **Class Declaration**: Defines a class in Java.
2. **Main Method**: The entry point of any Java application.
3. **Statements**: Instructions that the program executes.

### Example of a Simple Java Program
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
In this example:
- `public class HelloWorld`: Declares a class named `HelloWorld`.
- `public static void main(String[] args)`: Defines the main method.
- `System.out.println("Hello, World!");`: Prints the string to the console.

## Data Types in Java
Java is a statically typed language, meaning you must declare the data type of a variable before using it. The main data types in Java are categorized into two groups: **primitive types** and **reference types**.

### Primitive Data Types
1. **byte**: 8-bit integer (range: -128 to 127).
2. **short**: 16-bit integer (range: -32,768 to 32,767).
3. **int**: 32-bit integer (range: -2^31 to 2^31-1).
4. **long**: 64-bit integer (range: -2^63 to 2^63-1).
5. **float**: Single-precision 32-bit floating point.
6. **double**: Double-precision 64-bit floating point.
7. **char**: Single 16-bit Unicode character.
8. **boolean**: Represents true or false.

### Reference Data Types
Reference types are used to refer to objects and can be defined by the user. Examples include:
- **Strings**: A sequence of characters.
- **Arrays**: A collection of elements of the same type.
- **Classes**: User-defined data types.

## Variables and Constants
- **Variables**: Containers for storing data values. They must be declared with a specific data type.
- **Constants**: Variables that cannot be changed once initialized. In Java, you define a constant using the `final` keyword.

### Example of Variable and Constant Declaration
```java
int age = 25;              // Variable
final String NAME = "John"; // Constant
```

## Conclusion
In this lesson, you learned about the basic structure of a Java program, different data types, and how to declare variables and constants. In the next lesson, we will delve into control flow statements.

### Next Steps
- Practice writing simple Java programs using different data types and variables.
- Familiarize yourself with the concepts of primitive and reference types.

Happy coding!
