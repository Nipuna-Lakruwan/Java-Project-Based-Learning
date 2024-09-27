# Lesson 6: Java Generics - Creating a Generic To-Do List Manager

In this lesson, we will explore Java Generics, a powerful feature that allows you to define classes, interfaces, and methods with a placeholder for the type of data they operate on. We will apply this knowledge to create a generic To-Do List Manager that can handle tasks of various types.

## Objectives
- Understand the concept of generics in Java.
- Learn how to create a generic class and methods.
- Implement a generic To-Do List Manager.

## What are Generics?
Generics enable types (classes and interfaces) to be parameters when defining classes, interfaces, and methods. This provides type safety and eliminates the need for type casting.

### Benefits of Generics
1. **Type Safety**: Generics enforce type checks at compile time.
2. **Code Reusability**: Write a single class or method that works with any type.
3. **Elimination of Type Casting**: Reduces the need for explicit casting when retrieving elements from a collection.

## Creating a Generic To-Do List Manager

### Step 1: Define the Generic Class
We will create a generic class `TodoListManager` that can manage tasks of any type.

```java
import java.util.ArrayList;

public class TodoListManager<T> {
    private ArrayList<T> tasks;

    public TodoListManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(T task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}
```

### Step 2: Using the Generic Class
Now, we will create an instance of `TodoListManager` for `String` tasks in our `Main` class.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoListManager<String> toDoListManager = new TodoListManager<>();  // Managing String tasks
        String command;

        do {
            System.out.println("\nEnter a command (add/view/exit):");
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

### Step 3: Compiling and Running the Program
1. Compile the program:
   ```
   javac Main.java TodoListManager.java
   ```

2. Run the program:
   ```
   java Main
   ```

## Conclusion
In this lesson, you learned about Java Generics and how to create a generic To-Do List Manager. This approach allows you to create flexible and reusable code that can work with various data types.

### Next Steps
- Extend the functionality of the `TodoListManager` by adding methods for removing and completing tasks.
- Experiment with different types of tasks (e.g., custom objects) by creating instances of `TodoListManager` for those types.

Happy coding!