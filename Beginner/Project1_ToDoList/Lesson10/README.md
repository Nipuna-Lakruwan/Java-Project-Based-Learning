### Lesson 10: Java Threads and Multithreading - Running Tasks Concurrently

In this lesson, you'll explore **multithreading** in Java, which allows you to run multiple tasks simultaneously. Multithreading is useful for making applications more efficient and responsive, especially for tasks that can run independently.

---

### 📝 Key Concepts:
- **Thread**: A unit of execution within a program.
- **Runnable Interface**: A functional interface used to define the task a thread should execute.
- **Thread Class**: Represents a thread in Java and provides methods to manage it.
- **Synchronization**: A mechanism to control the access of multiple threads to shared resources.

---

### What You'll Learn:
- How to create and manage threads in Java.
- How to use the `Runnable` interface to define a task for a thread.
- Synchronization to avoid thread interference in shared resources.

---

### Code Examples:

1. **Creating and Starting Threads:**

```java
public class SimpleThreadExample {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new Task("Task 1"));
        Thread thread2 = new Thread(new Task("Task 2"));

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Count: " + i);
            try {
                Thread.sleep(1000);  // Pause the thread for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}
```

2. **Thread Synchronization:**

```java
public class SynchronizedCounterExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();  // Wait for thread1 to finish
            thread2.join();  // Wait for thread2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + counter.getValue());
    }
}

class Counter {
    private int value = 0;

    // Synchronized method to ensure only one thread can modify value at a time
    public synchronized void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}
```

3. **Creating Threads by Extending the `Thread` Class:**

```java
public class ThreadExample extends Thread {
    private String threadName;

    public ThreadExample(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500);  // Pause the thread for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample("Thread 1");
        ThreadExample thread2 = new ThreadExample("Thread 2");

        thread1.start();
        thread2.start();
    }
}
```

---

### 🚀 Your Task

1. **Multithreading in To-Do App**:
   - Enhance your `TodoListManager` to periodically auto-save tasks in the background using a separate thread.
   - You can use the `Timer` or `ScheduledExecutorService` for periodic tasks.

2. **Synchronization**:
   - Ensure that if multiple threads are modifying the task list at the same time (e.g., one adding tasks while another is saving), no conflicts or data corruption occur.

---

### Next Lesson
In **Lesson 11**, we’ll explore **Java I/O Streams** and how to efficiently handle input/output operations in Java.

---