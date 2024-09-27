### Lesson 7: Java Collections - Managing To-Do Lists Efficiently

#### 1. Introduction

In this lesson, we will dive deeper into **Java Collections** and explore how they can help us manage tasks in a to-do list more efficiently. We’ll look at how to store, retrieve, and manipulate collections of tasks using the `List`, `Set`, and `Map` interfaces.

#### 2. Key Concepts

- **List**: An ordered collection (also known as a sequence) that can contain duplicate elements. Example: `ArrayList`, `LinkedList`.
- **Set**: A collection that cannot contain duplicate elements. Example: `HashSet`, `TreeSet`.
- **Map**: An object that maps keys to values. A `Map` cannot contain duplicate keys. Example: `HashMap`, `TreeMap`.

#### 3. Project Overview

We will extend the **To-Do List Manager** application to manage tasks using various collections, providing more flexibility and efficiency in how we store and access tasks.

#### 4. Code Walkthrough

### 4.1. Using `ArrayList` to Manage Tasks

We'll refactor the `ToDoListManager` to use an `ArrayList` for storing tasks, which allows efficient random access to tasks and maintains the insertion order.

```java
import java.util.ArrayList;

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
}
```

### 4.2. Using `HashSet` for Unique Tasks

If you want to ensure no duplicate tasks are added to the list, you can switch to a `HashSet`. This will guarantee that each task is unique.

```java
import java.util.HashSet;

public class ToDoListManager {
    private HashSet<String> tasks;

    public ToDoListManager() {
        tasks = new HashSet<>();
    }

    public void addTask(String task) {
        if (tasks.add(task)) {
            System.out.println("Task added: " + task);
        } else {
            System.out.println("Task already exists: " + task);
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            int i = 1;
            for (String task : tasks) {
                System.out.println(i + ". " + task);
                i++;
            }
        }
    }

    public void removeTask(String task) {
        if (tasks.remove(task)) {
            System.out.println("Task removed: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }
}
```

### 4.3. Using `HashMap` for Categorized Tasks

In more complex applications, you might want to categorize tasks. Using a `HashMap`, you can associate tasks with categories (like "Work", "Personal", "Shopping").

```java
import java.util.HashMap;
import java.util.ArrayList;

public class ToDoListManager {
    private HashMap<String, ArrayList<String>> tasks;

    public ToDoListManager() {
        tasks = new HashMap<>();
    }

    public void addTask(String category, String task) {
        tasks.computeIfAbsent(category, k -> new ArrayList<>()).add(task);
        System.out.println("Task added to " + category + ": " + task);
    }

    public void viewTasks(String category) {
        if (tasks.containsKey(category)) {
            ArrayList<String> taskList = tasks.get(category);
            if (taskList.isEmpty()) {
                System.out.println("No tasks in the " + category + " category.");
            } else {
                for (int i = 0; i < taskList.size(); i++) {
                    System.out.println((i + 1) + ". " + taskList.get(i));
                }
            }
        } else {
            System.out.println("No tasks found for the category: " + category);
        }
    }

    public void removeTask(String category, String task) {
        if (tasks.containsKey(category) && tasks.get(category).remove(task)) {
            System.out.println("Task removed from " + category + ": " + task);
        } else {
            System.out.println("Task not found in the category: " + category);
        }
    }
}
```

### 5. Code Organization

- **ToDoListManager.java**: Now uses collections (`ArrayList`, `HashSet`, or `HashMap`) to manage tasks.
- **ToDoApp.java**: Handles user input and interacts with `ToDoListManager` based on the collection type used.

### 6. Challenges

Try these challenges to further explore collections:
- Implement sorting for tasks within a category using a `TreeSet` or `Collections.sort()`.
- Extend the `ToDoListManager` to support searching for tasks using a specific keyword or category.
- Implement a **priority queue** of tasks, where tasks with higher priorities get completed first.

### 7. Summary

In this lesson, you learned how to use Java Collections (`List`, `Set`, `Map`) to efficiently manage tasks in the to-do list application. Collections provide powerful tools for storing and manipulating data and can greatly enhance the flexibility and performance of your applications.

Next, we'll explore **Exception Handling** to make our applications more robust.

Happy coding! 🚀
