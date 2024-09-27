### Lesson 6: Java Generics - Creating a Generic To-Do List Manager

#### 1. Introduction

In this lesson, we will introduce **Generics** in Java. Generics allow us to write more flexible and reusable code by allowing classes, interfaces, and methods to operate on types specified by the user. We will refactor the **To-Do List Manager** application to use Generics, enabling the task list to manage different types of tasks.

#### 2. Key Concepts

- **Generics**: Enable types (classes and interfaces) to be parameters when defining classes, interfaces, and methods.
- **Type Parameters**: Allows classes and methods to operate on various data types without compromising type safety.

#### 3. Project Overview

We will refactor the `ToDoListManager` class to use **Generics** so it can manage tasks of different types, not just strings. For example, you can now create a to-do list that manages `String`, `Integer`, or even custom object types.

#### 4. Code Walkthrough

### 4.1. Refactored `ToDoListManager` with Generics

In this updated version of the `ToDoListManager`, we will allow it to manage tasks of any type using a **type parameter** `<T>`.

```java
import java.util.ArrayList;
import java.io.*;

public class ToDoListManager<T> {
    private ArrayList<T> tasks;

    public ToDoListManager() {
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

    public void removeTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            System.out.println("Task removed: " + tasks.get(index - 1));
            tasks.remove(index - 1);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void completeTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            System.out.println("Task completed: " + tasks.get(index - 1));
            tasks.remove(index - 1);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void saveTasksToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (T task : tasks) {
                writer.write(task.toString() + "\n");
            }
            System.out.println("Tasks saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    public void loadTasksFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String task;
            while ((task = reader.readLine()) != null) {
                // This will need casting depending on the task type
                System.out.println("Task loaded: " + task);
            }
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }
    }
}
```

### 4.2. Modifying `ToDoApp` for Generics

The `ToDoApp` class will remain mostly the same, except that now, we specify the type of tasks we want to manage.

```java
import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoListManager<String> toDoListManager = new ToDoListManager<>();  // Managing String tasks
        String command;

        do {
            System.out.println("\nEnter a command (add/view/remove/complete/save/load/exit):");
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
                    System.out.println("Enter the task number to remove:");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    toDoListManager.removeTask(taskNumber);
                    break;
                case "complete":
                    System.out.println("Enter the task number to complete:");
                    int completeTaskNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    toDoListManager.completeTask(completeTaskNumber);
                    break;
                case "save":
                    System.out.println("Enter the filename to save tasks:");
                    String saveFilename = scanner.nextLine();
                    toDoListManager.saveTasksToFile(saveFilename);
                    break;
                case "load":
                    System.out.println("Enter the filename to load tasks:");
                    String loadFilename = scanner.nextLine();
                    toDoListManager.loadTasksFromFile(loadFilename);
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

### 5. Code Organization

- **ToDoListManager.java**: Now uses Generics to manage tasks of any type.
- **ToDoApp.java**: Handles user input and interacts with `ToDoListManager` using specific task types (`String` in this case).

### 6. Challenges

Try these challenges to expand your understanding:
- Modify the application to handle **custom task objects** (e.g., a `Task` class with fields like `title`, `dueDate`, and `priority`).
- Implement sorting tasks by different criteria, like task name or date.
- Explore other uses of **Generics** in your code, such as using it in methods or other classes.

### 7. Summary

This lesson introduced the concept of **Generics** and how they can make your code more flexible and reusable. By using Generics in the `ToDoListManager`, you can now manage tasks of any type, making the application more versatile.

In the next lesson, we'll explore **Collections and Data Structures** to manage tasks more efficiently.

Happy coding! 🚀
