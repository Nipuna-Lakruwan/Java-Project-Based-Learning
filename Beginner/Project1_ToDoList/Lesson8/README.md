Let's move to **Lesson 8: Java Maps - Associating Keys with Values**. Here's the **README.md** for Lesson 8.

---

### Lesson 8: Java Maps - Associating Keys with Values

In this lesson, you’ll learn how to use the `Map` interface in Java. Maps store key-value pairs, making them ideal for situations where you need to look up values based on a unique key.

---

### 📝 Key Concepts:
- **Map**: A collection that associates keys with values. Each key is unique, and a single key maps to exactly one value.
- **HashMap**: A common implementation of `Map` that stores key-value pairs without a specific order.
- **TreeMap**: Another implementation of `Map` that stores key-value pairs in a sorted order based on the keys.

---

### What You'll Learn:
- How to create and use `HashMap` and `TreeMap`.
- Basic operations like adding, removing, and searching for key-value pairs.

---

### Code Examples:

1. **Using HashMap:**

```java
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> tasks = new HashMap<>();
        tasks.put("Complete lesson 8", 1);
        tasks.put("Learn Java Maps", 2);

        System.out.println("Task: " + tasks.get("Complete lesson 8"));
        
        tasks.remove("Learn Java Maps"); // Removes the task
        
        System.out.println("All tasks:");
        for (String task : tasks.keySet()) {
            System.out.println(task + ": Priority " + tasks.get(task));
        }
    }
}
```

2. **Using TreeMap:**

```java
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> tasks = new TreeMap<>();
        tasks.put("Finish Java project", 1);
        tasks.put("Attend meeting", 3);
        tasks.put("Read documentation", 2);
        
        for (String task : tasks.keySet()) {
            System.out.println(task + ": Priority " + tasks.get(task));
        }
    }
}
```

---

### 🚀 Your Task

1. Create a **TaskPriorityManager** class that uses a `HashMap` to associate tasks with their priority.
   - Add tasks with different priorities.
   - Implement methods to change task priority and display all tasks in order.

2. Extend your `TodoListManager` to allow setting and viewing task priorities using a `TreeMap`.

---

### Next Lesson
In **Lesson 9**, we will explore **Java Exception Handling** and learn how to write robust code that gracefully handles errors.

---