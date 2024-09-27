# Lesson 11: User Input and Command-Line Interaction

In this lesson, we will explore how to handle user input in Java applications, particularly through the command line. We will see how to use the `Scanner` class to read user input and implement command-line interaction in our To-Do List Manager.

## Objectives
- Understand how to use the `Scanner` class for input.
- Learn how to implement a command-line interface (CLI) for the To-Do List Manager.
- Manage user commands and interactions effectively.

## Using the Scanner Class
The `Scanner` class is part of the `java.util` package and is used to read input from various sources, including keyboard input. To use `Scanner`, you need to create an instance of it, typically by passing `System.in` to its constructor.

### Example
```java
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
```

## Implementing Command-Line Interaction in To-Do List Manager
We will modify the `Main` class to include a simple command-line interface that allows users to interact with the To-Do List Manager.

### Updated `Main.java`
Here’s an example of how your `Main.java` file might look with user input handling:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoListManager<String> toDoListManager = new TodoListManager<>();
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

## Managing User Commands
In the updated `Main.java`, users can enter commands to manage their to-do list. This includes adding tasks, viewing tasks, removing tasks, completing tasks, saving tasks to a file, loading tasks from a file, and exiting the application.

### Tips for Command Management
- Always validate user input to avoid errors (e.g., checking if task numbers are within the valid range).
- Use clear and concise prompts to guide users on what inputs are expected.

## Conclusion
In this lesson, you learned how to handle user input in Java using the `Scanner` class and implemented a command-line interface for your To-Do List Manager. User interaction is crucial for creating an engaging application experience.

### Next Steps
- Explore how to enhance the user experience, such as adding error messages for invalid inputs or improving the command handling logic.
- Consider implementing additional features like task prioritization or due dates for tasks.

Happy coding!