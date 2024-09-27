# Lesson 7: Java Collections - Managing To-Do Lists Efficiently

In this lesson, we will delve into Java Collections, a framework that provides a set of classes and interfaces for storing and manipulating groups of data. We will use collections to enhance the functionality of our To-Do List Manager, allowing us to manage tasks more efficiently.

## Objectives
- Understand the Java Collections framework.
- Learn about different collection types and their use cases.
- Implement a more efficient To-Do List Manager using collections.

## Overview of Java Collections
Java Collections provide various interfaces (like `List`, `Set`, and `Map`) and classes (like `ArrayList`, `HashSet`, and `HashMap`) to handle groups of objects. Here are some key collection types:

1. **List**: An ordered collection that allows duplicates (e.g., `ArrayList`, `LinkedList`).
2. **Set**: A collection that does not allow duplicates (e.g., `HashSet`, `TreeSet`).
3. **Map**: A collection of key-value pairs (e.g., `HashMap`, `TreeMap`).

### Choosing the Right Collection
- Use `ArrayList` when you need a resizable array for storing elements.
- Use `HashSet` when you want to ensure that no duplicates are present.
- Use `HashMap` for fast lookups based on keys.

## Enhancing the To-Do List Manager

### Step 1: Updating the TodoListManager
We will modify our `TodoListManager` to use an `ArrayList` for task management and add functionality for removing and completing tasks.

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
}
```

### Step 2: Updating the Main Class
Next, we will add options for removing and completing tasks in the `Main` class.

```java
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
                    System.out.println("Enter the task number to remove:");
                    int removeTaskNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    toDoListManager.removeTask(removeTaskNumber);
                    break;
                case "complete":
                    System.out.println("Enter the task number to complete:");
                    int completeTaskNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    toDoListManager.completeTask(completeTaskNumber);
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
In this lesson, you learned about the Java Collections framework and how to implement an efficient To-Do List Manager using an `ArrayList`. You also enhanced the functionality by adding methods for removing and completing tasks.

### Next Steps
- Explore additional collections like `HashSet` and `HashMap` for more complex task management scenarios.
- Implement sorting or prioritization features for tasks.

Happy coding!
