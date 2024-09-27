# Lesson 15: Refactoring the To-Do App

In this lesson, we will focus on refactoring the To-Do List Manager application to improve code readability, maintainability, and efficiency. Refactoring is the process of restructuring existing computer code without changing its external behavior.

## Objectives
- Understand the importance of code refactoring.
- Identify areas in the code that can be improved.
- Implement best practices for Java programming.

## Why Refactor?
Refactoring helps in:
- Improving code clarity and reducing complexity.
- Enhancing performance and efficiency.
- Making the code easier to maintain and update.
- Reducing the risk of bugs.

## Areas to Refactor
We will focus on the following areas in our To-Do List application:
1. **Task Class**: Create a dedicated `Task` class to encapsulate task properties like name, priority, and category.
2. **Separation of Concerns**: Separate the GUI and business logic for better maintainability.
3. **Enhancing User Input Handling**: Validate user input and handle exceptions properly.

### 1. Creating a Task Class
Instead of using a `String` to represent tasks, we will create a `Task` class to store task details:

```java
public class Task {
    private String name;
    private int priority;
    private String category;

    public Task(String name, int priority, String category) {
        this.name = name;
        this.priority = priority;
        this.category = category;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s (%s)", priority, name, category);
    }
}
```

### 2. Refactoring TodoListManager
Update the `TodoListManager` class to use the `Task` class instead of `String`:

```java
public class TodoListManager {
    private ArrayList<Task> tasks;

    public TodoListManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
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

    // ... Other methods remain unchanged
}
```

### 3. Updating the GUI
Modify the GUI to create `Task` objects and pass them to the `TodoListManager`:

```java
private void addTask() {
    String taskName = taskInput.getText();
    int priority = Integer.parseInt(priorityInput.getText());
    String category = categoryInput.getText();
    Task task = new Task(taskName, priority, category);
    toDoListManager.addTask(task);
    taskInput.setText("");
    priorityInput.setText("");
    categoryInput.setText("");
}
```

### 4. Improving User Input Handling
Add validation for user input to ensure valid values for priority and category. For example:

```java
private void addTask() {
    String taskName = taskInput.getText();
    try {
        int priority = Integer.parseInt(priorityInput.getText());
        String category = categoryInput.getText();

        if (priority < 1 || priority > 10) {
            throw new NumberFormatException("Priority must be between 1 and 10.");
        }

        Task task = new Task(taskName, priority, category);
        toDoListManager.addTask(task);
        taskInput.setText("");
        priorityInput.setText("");
        categoryInput.setText("");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid input: " + e.getMessage());
    }
}
```

### Conclusion
In this lesson, we have refactored the To-Do List Manager application to make it more robust and maintainable. By creating a `Task` class and separating concerns, our code is now easier to read and modify.

### Next Steps
- Consider implementing more advanced features, such as task sorting and searching.
- Explore unit testing to ensure that our application behaves as expected.

Happy coding!
