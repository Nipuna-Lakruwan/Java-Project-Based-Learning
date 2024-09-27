# Lesson 8: Exception Handling in Java

In this lesson, we will explore the concept of exception handling in Java. Exception handling is a powerful mechanism that allows developers to manage runtime errors, ensuring the normal flow of the application is maintained even when unexpected events occur.

## Objectives
- Understand what exceptions are and how they differ from errors.
- Learn about the hierarchy of exceptions in Java.
- Implement try-catch blocks to handle exceptions.
- Create custom exceptions for specific scenarios.

## Understanding Exceptions
An exception is an event that disrupts the normal flow of the program. In Java, exceptions are objects that represent these errors. The Java Exception hierarchy is divided into two main categories:

1. **Checked Exceptions**: These exceptions are checked at compile-time (e.g., `IOException`, `SQLException`).
2. **Unchecked Exceptions**: These exceptions are checked at runtime (e.g., `NullPointerException`, `ArrayIndexOutOfBoundsException`).

### Exception Hierarchy
- **Throwable**: The superclass of all errors and exceptions.
  - **Error**: Represents serious problems that a reasonable application should not catch (e.g., `OutOfMemoryError`).
  - **Exception**: The superclass for all exceptions that can be caught and handled.

## Implementing Exception Handling

### Step 1: Using Try-Catch Blocks
The basic syntax for handling exceptions is to use a `try` block followed by one or more `catch` blocks.

```java
try {
    // Code that may throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
}
```

### Example: Handling InputMismatchException
In our To-Do List Manager, we can modify the `Main` class to handle input exceptions when reading user input.

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoListManager<String> toDoListManager = new TodoListManager<>();  // Managing String tasks
        String command;

        do {
            System.out.println("\nEnter a command (add/view/remove/complete/exit):");
            command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.println("Enter the task:");
                    String task = scanner.nextLine();
                    toDoListManager.addTask(task);
                    break;
                case "view":
                    toDoListManager.viewTasks();
                    break;
                case "remove":
                    try {
                        System.out.println("Enter the task number to remove:");
                        int removeTaskNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        toDoListManager.removeTask(removeTaskNumber);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.nextLine(); // Clear the invalid input
                    }
                    break;
                case "complete":
                    try {
                        System.out.println("Enter the task number to complete:");
                        int completeTaskNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        toDoListManager.completeTask(completeTaskNumber);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.nextLine(); // Clear the invalid input
                    }
                    break;
                case "exit":
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        } while (!command.equals("exit"));

        scanner.close();
    }
}
```

### Step 2: Creating Custom Exceptions
You can create custom exceptions by extending the `Exception` class.

```java
public class TaskNotFoundException extends Exception {
    public TaskNotFoundException(String message) {
        super(message);
    }
}
```

You can then use this custom exception in your methods, for example, when trying to remove a task that does not exist.

```java
public void removeTask(int index) throws TaskNotFoundException {
    if (index < 1 || index > tasks.size()) {
        throw new TaskNotFoundException("Invalid task number.");
    }
    System.out.println("Task removed: " + tasks.get(index - 1));
    tasks.remove(index - 1);
}
```

## Conclusion
In this lesson, you learned about exception handling in Java, including the hierarchy of exceptions and how to implement try-catch blocks. You also explored creating custom exceptions to handle specific scenarios in your To-Do List Manager.

### Next Steps
- Implement more complex exception handling for file operations (e.g., when saving or loading tasks).
- Explore the `finally` block to execute code regardless of whether an exception was thrown.

Happy coding!