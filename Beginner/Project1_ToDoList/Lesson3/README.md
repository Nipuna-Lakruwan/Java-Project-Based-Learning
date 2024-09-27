# Lesson 3: Control Flow and Loops

In this lesson, we will cover control flow statements and loops in Java. These constructs allow you to dictate the flow of execution in your programs, making them dynamic and capable of handling different scenarios.

## Objectives
- Understand the different types of control flow statements.
- Learn how to use conditional statements (if, else if, else).
- Get familiar with looping structures (for, while, do-while).

## Control Flow Statements
Control flow statements determine the order in which statements are executed in a program. The main types include:

1. **Conditional Statements**: Execute a block of code based on a condition.
2. **Looping Statements**: Repeat a block of code multiple times.

### Conditional Statements
The most common conditional statements in Java are `if`, `else if`, and `else`.

#### Example of Conditional Statements
```java
int number = 10;

if (number > 0) {
    System.out.println("The number is positive.");
} else if (number < 0) {
    System.out.println("The number is negative.");
} else {
    System.out.println("The number is zero.");
}
```

### Switch Statement
The `switch` statement allows you to execute one block of code among many based on the value of a variable.

#### Example of Switch Statement
```java
char grade = 'B';

switch (grade) {
    case 'A':
        System.out.println("Excellent!");
        break;
    case 'B':
        System.out.println("Well done!");
        break;
    case 'C':
        System.out.println("Good!");
        break;
    default:
        System.out.println("Invalid grade.");
}
```

## Loops
Loops are used to execute a block of code multiple times. The main types of loops in Java are `for`, `while`, and `do-while`.

### For Loop
The `for` loop is used when the number of iterations is known beforehand.

#### Example of For Loop
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
```

### While Loop
The `while` loop continues executing as long as the condition is true.

#### Example of While Loop
```java
int i = 0;
while (i < 5) {
    System.out.println("Iteration: " + i);
    i++;
}
```

### Do-While Loop
The `do-while` loop executes the block of code at least once, regardless of the condition.

#### Example of Do-While Loop
```java
int j = 0;
do {
    System.out.println("Iteration: " + j);
    j++;
} while (j < 5);
```

## Conclusion
In this lesson, you learned about control flow statements, including conditional statements and loops. Mastering these concepts is crucial for writing dynamic and efficient Java programs.

### Next Steps
- Practice using conditional statements and loops in small programs.
- Experiment with different loop structures to understand their behavior.

Happy coding!