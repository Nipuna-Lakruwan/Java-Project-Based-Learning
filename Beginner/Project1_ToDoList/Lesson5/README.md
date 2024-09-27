# Lesson 5: Refactoring the To-Do List Application Using Object-Oriented Principles

## 1. Introduction

In this lesson, we will refactor the To-Do List application by applying key Object-Oriented Programming (OOP) principles. The main focus will be on improving the structure of the code by using encapsulation and separation of concerns to make it more modular, maintainable, and reusable.

## 2. Key Concepts

- **Encapsulation**: Wrapping data and code together into a single unit (class), making the internal structure hidden from outside access.
- **Separation of Concerns**: Dividing the program into sections, each handling a distinct aspect, for better maintainability and scalability.

## 3. Project Overview

The project has been refactored to split logic into two main classes:
- **ToDoListManager**: Handles the logic related to managing tasks (add, remove, complete, save, load).
- **ToDoApp**: Handles user interaction (taking input, displaying the menu).

This refactor follows Object-Oriented best practices, making the code cleaner and easier to maintain.

## 4. Code Walkthrough

### 4.1. ToDoListManager Class

The `ToDoListManager` class is responsible for managing the to-do list and its tasks. It encapsulates task-related operations like adding, removing, and saving tasks.

```java
import java.util.ArrayList;
import java.io.*;

public class ToDoListManager {
    private ArrayList<String> tasks;

    public ToDoListManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
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
            for (String task : tasks) {
                writer.write(task + "\n");
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
                tasks.add(task);
            }
            System.out.println("Tasks loaded from " + filename);
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }
    }
}
```

### 4.1. 4.2. ToDoApp Class

The `ToDoApp` class is responsible for managing user input and interactions. It uses the ToDoListManager to perform tasks based on user commands.

```java
import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoListManager toDoListManager = new ToDoListManager();
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

## 5. Code Organization

  -	**ToDoListManager.java**: Contains all the logic for managing tasks.
	-	**ToDoApp.java**: Manages user input and command execution by calling methods in ToDoListManager.

## 6. Challenges

Here are a few challenges to extend your learning:

  - Add an **edit task** feature.
	-	Implement **undo** functionality.
	-	Keep a log of completed tasks, instead of removing them.

## 7. Summary

This lesson demonstrates how to refactor the original To-Do List application using Object-Oriented Programming principles. The code is now more structured, reusable, and maintainable. Moving forward, we will build on these concepts with more complex topics like Java Generics and Threading.

Happy coding! 🚀