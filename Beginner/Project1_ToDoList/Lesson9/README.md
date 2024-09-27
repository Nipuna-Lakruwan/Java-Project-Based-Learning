### Lesson 9: Java Exception Handling - Writing Robust Code

In this lesson, you'll learn about **exception handling** in Java. Exception handling helps you write code that can handle errors gracefully without crashing the program.

---

### 📝 Key Concepts:
- **Exception**: An event that disrupts the normal flow of a program’s instructions.
- **try-catch block**: The structure used in Java to handle exceptions.
- **throw**: Used to manually trigger an exception.
- **finally**: Code block that will always execute after try-catch, whether an exception occurs or not.

---

### What You'll Learn:
- How to handle errors using `try-catch` blocks.
- How to throw exceptions to indicate error conditions.
- The importance of the `finally` block in resource management.

---

### Code Examples:

1. **Basic try-catch block:**

```java
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;  // This will cause ArithmeticException when b is 0
    }
}
```

2. **Using `throw` to manually raise an exception:**

```java
public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            checkAge(15);  // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }
}
```

3. **finally block:**

```java
import java.io.*;

public class FileHandlingWithFinally {
    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("example.txt");
            BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("File not found or error reading the file.");
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file.");
            }
        }
    }
}
```

---

### 🚀 Your Task

1. Modify your `TodoListManager` to handle potential errors like:
   - **FileNotFoundException**: Handle cases where the file to load tasks from doesn't exist.
   - **IndexOutOfBoundsException**: Handle cases where an invalid task number is provided for removal or completion.

2. Implement a custom exception class, **InvalidTaskException**, that gets thrown when trying to remove or complete a task that doesn’t exist.

---

### Next Lesson
In **Lesson 10**, we’ll dive into **Java Threads and Multithreading**, where you’ll learn how to run tasks concurrently.

---