# Lesson 9: File I/O - Saving and Loading Tasks

In this lesson, we will explore File Input/Output (I/O) in Java, specifically how to save and load tasks in our To-Do List Manager. File I/O allows us to persist data even after the application is closed, enhancing the functionality of our application.

## Objectives
- Understand the basics of file handling in Java.
- Learn to save tasks to a file.
- Load tasks from a file into the application.

## Understanding File I/O in Java
Java provides several classes for file handling, primarily found in the `java.io` package. The two main classes we will focus on are:

1. **FileWriter**: Used for writing character files.
2. **BufferedReader**: Used for reading text from a character-input stream, buffering characters for efficient reading.

### Writing to a File
To save tasks, we will use `FileWriter`. Here’s how we can implement the `saveTasksToFile` method in our `TodoListManager` class.

```java
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
```

### Reading from a File
To load tasks, we will use `BufferedReader` to read the file line by line and add each task to our task list.

```java
public void loadTasksFromFile(String filename) {
    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
        String task;
        while ((task = reader.readLine()) != null) {
            addTask((T) task); // Add each task to the list
            System.out.println("Task loaded: " + task);
        }
    } catch (IOException e) {
        System.out.println("Error loading tasks: " + e.getMessage());
    }
}
```

### Example Implementation
Here is how you can implement the saving and loading functionality in the `Main` class:

```java
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
```

## Conclusion
In this lesson, you learned about file handling in Java, specifically how to save and load tasks in your To-Do List Manager. You now have the capability to persist user data, which improves the overall user experience of your application.

### Next Steps
- Explore handling exceptions specifically related to file operations.
- Consider adding functionality to check if a file exists before loading tasks to avoid errors.

Happy coding!
