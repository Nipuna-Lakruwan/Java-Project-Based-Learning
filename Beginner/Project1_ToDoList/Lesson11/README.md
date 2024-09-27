### Lesson 11: Java I/O Streams - Handling Input and Output Operations

In this lesson, you'll learn about **Java I/O Streams**, which allow you to read from and write to files, enabling your To-Do App to persist data even after the application is closed.

---

### 📝 Key Concepts:
- **InputStream and OutputStream**: Classes for reading and writing bytes.
- **Reader and Writer**: Classes for reading and writing character data.
- **File I/O**: Using Java's `File`, `FileReader`, `FileWriter`, `BufferedReader`, and `BufferedWriter` for file operations.

---

### What You'll Learn:
- How to read from a file using `BufferedReader`.
- How to write to a file using `BufferedWriter`.
- Handling exceptions during I/O operations.

---

### Code Examples:

1. **Writing to a File:**

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String filename = "tasks.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Task 1\n");
            writer.write("Task 2\n");
            writer.write("Task 3\n");
            System.out.println("Tasks saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
```

2. **Reading from a File:**

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        String filename = "tasks.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read task: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
```

3. **Integrating File I/O into Your To-Do App**:
   - Update your `TodoListManager` to save tasks to a file when using the `saveTasksToFile` method and load tasks from a file in the `loadTasksFromFile` method.

### Updated `loadTasksFromFile` Method Example:

```java
public void loadTasksFromFile(String filename) {
    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
        String task;
        while ((task = reader.readLine()) != null) {
            addTask((T) task);  // Cast to generic type T
            System.out.println("Task loaded: " + task);
        }
    } catch (IOException e) {
        System.out.println("Error loading tasks: " + e.getMessage());
    }
}
```

---

### 🚀 Your Task

1. **Implement File I/O**:
   - Integrate the provided file reading and writing examples into your `TodoListManager` class.
   - Ensure that your application can save and load tasks from a specified file.

2. **Testing**:
   - Test your application by adding tasks, saving them to a file, and then loading them to see if they appear correctly.

---

### Next Lesson
In **Lesson 12**, we’ll cover the **Final Enhancements** for your To-Do App, where you'll polish the application and add any additional features or improvements you want.

---