# Lesson 13: Enhancing the To-Do List Functionality

In this lesson, we will explore ways to enhance the functionality of our To-Do List Manager by adding new features that improve task management. Enhancements may include task prioritization, categorization, and deadlines.

## Objectives
- Implement task prioritization to help users focus on important tasks.
- Introduce task categorization for better organization.
- Allow users to set deadlines for tasks.

## Task Prioritization
Adding a priority level to tasks can help users identify what needs to be done first. We will allow users to set a priority when adding a task.

### Modifying the Task Structure
First, modify the task structure to include a priority level. You can create a `Task` class to hold the task details, including the description and priority.

```java
public class Task {
    private String description;
    private int priority; // 1 = High, 2 = Medium, 3 = Low

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "[" + priority + "] " + description; // Display priority with task
    }
}
```

### Updating the `addTask` Method
Change the `addTask` method to accept a priority level when adding a new task.

```java
public void addTask(String description, int priority) {
    Task newTask = new Task(description, priority);
    tasks.add(newTask);
    System.out.println("Task added: " + newTask);
}
```

### User Input for Priority
When prompting the user to add a task, include an option to enter the priority.

```java
System.out.println("Enter the task:");
String taskDescription = scanner.nextLine();
System.out.println("Enter the priority (1-High, 2-Medium, 3-Low):");
int priority = scanner.nextInt();
scanner.nextLine(); // Consume newline
toDoListManager.addTask(taskDescription, priority);
```

## Task Categorization
Allowing users to categorize tasks can further improve organization. You can create predefined categories, such as "Work," "Personal," or "Shopping."

### Modifying the Task Class
Update the `Task` class to include a category field.

```java
public class Task {
    private String description;
    private int priority;
    private String category;

    public Task(String description, int priority, String category) {
        this.description = description;
        this.priority = priority;
        this.category = category;
    }

    // Other methods remain unchanged...
}
```

### Updating the `addTask` Method for Category
Modify the `addTask` method to accept a category as well.

```java
public void addTask(String description, int priority, String category) {
    Task newTask = new Task(description, priority, category);
    tasks.add(newTask);
    System.out.println("Task added: " + newTask);
}
```

### User Input for Category
Prompt the user for a category when adding a new task.

```java
System.out.println("Enter the category (e.g., Work, Personal):");
String category = scanner.nextLine();
toDoListManager.addTask(taskDescription, priority, category);
```

## Setting Deadlines
In addition to categorization and prioritization, enabling deadlines helps users manage their time effectively. You can store deadlines as `LocalDate` objects.

### Modifying the Task Class for Deadline
Update the `Task` class to include a deadline field.

```java
import java.time.LocalDate;

public class Task {
    private String description;
    private int priority;
    private String category;
    private LocalDate deadline;

    public Task(String description, int priority, String category, LocalDate deadline) {
        this.description = description;
        this.priority = priority;
        this.category = category;
        this.deadline = deadline;
    }

    // Other methods remain unchanged...
}
```

### Updating the `addTask` Method for Deadline
Modify the `addTask` method to accept a deadline.

```java
public void addTask(String description, int priority, String category, LocalDate deadline) {
    Task newTask = new Task(description, priority, category, deadline);
    tasks.add(newTask);
    System.out.println("Task added: " + newTask);
}
```

### User Input for Deadline
Prompt the user for a deadline when adding a new task.

```java
System.out.println("Enter the deadline (YYYY-MM-DD):");
String deadlineInput = scanner.nextLine();
LocalDate deadline = LocalDate.parse(deadlineInput);
toDoListManager.addTask(taskDescription, priority, category, deadline);
```

## Conclusion
By enhancing the To-Do List Manager with task prioritization, categorization, and deadlines, we have significantly improved its functionality. Users can now better manage their tasks according to importance and categories.

### Next Steps
- Consider adding sorting features to display tasks by priority or category.
- Explore options for notifications or reminders for approaching deadlines.

Happy coding!