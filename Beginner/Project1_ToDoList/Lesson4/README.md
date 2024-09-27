# Lesson 4: Functions and Methods

In this lesson, we will explore functions and methods in Java. Functions (or methods) allow you to encapsulate code into reusable blocks, making your programs more modular and easier to manage.

## Objectives
- Understand the purpose of functions and methods.
- Learn how to define and invoke functions.
- Explore the concepts of parameters, return types, and method overloading.

## What Are Functions and Methods?
A function is a block of code that performs a specific task. In Java, functions are defined within a class and are commonly referred to as methods. They can take parameters, perform operations, and return values.

### Defining a Method
To define a method in Java, you need to specify the return type, method name, and parameters (if any).

#### Syntax
```java
returnType methodName(parameterType parameterName) {
    // method body
    return value; // if returnType is not void
}
```

#### Example of a Simple Method
```java
public int add(int a, int b) {
    return a + b;
}
```

### Invoking a Method
To invoke (call) a method, use its name followed by parentheses. If the method has parameters, provide the necessary arguments inside the parentheses.

#### Example of Invoking a Method
```java
public static void main(String[] args) {
    Main main = new Main(); // Create an instance of the class
    int sum = main.add(5, 10);
    System.out.println("Sum: " + sum); // Output: Sum: 15
}
```

## Parameters and Return Types
Methods can take parameters to operate on and can return values to the caller.

### Parameters
You can define multiple parameters in a method by separating them with commas.

#### Example with Multiple Parameters
```java
public void displayInfo(String name, int age) {
    System.out.println("Name: " + name + ", Age: " + age);
}
```

### Return Types
The return type of a method specifies the type of value the method returns. If a method does not return a value, use `void`.

## Method Overloading
Method overloading allows you to define multiple methods with the same name but different parameters (different type or number of parameters). This enables you to perform similar operations with different data types.

### Example of Method Overloading
```java
public int multiply(int a, int b) {
    return a * b;
}

public double multiply(double a, double b) {
    return a * b;
}

public int multiply(int a, int b, int c) {
    return a * b * c;
}
```

## Conclusion
In this lesson, you learned about functions and methods in Java, including how to define, invoke, and overload them. Mastering these concepts will help you write cleaner and more modular code.

### Next Steps
- Practice creating and invoking your own methods.
- Experiment with method overloading by creating multiple versions of the same method.

Happy coding!