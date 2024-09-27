import java.io.*;
import java.util.ArrayList;

/**
 * ToDoListManager is responsible for managing the to-do list tasks,
 * including adding, removing, completing, and persisting tasks.
 */

public class TodoListManager {
    private ArrayList<String> tasks;

    public TodoListManager() {
        tasks = new ArrayList<>();
    }

    // Add task to the list
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // View all tasks
    public void viewTasks(){
        System.out.println("Your To-Do- List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    // Remove a task by index
    public void removeTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            String removedTask = tasks.remove(index - 1);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Complete a task
    public void completeTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            System.out.println("Task completed: " + tasks.get(index - 1));
            tasks.remove(index - 1); // Remove the task after completion
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Save tasks to a file
    public void saveTasksToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (String task : tasks) {
                writer.write(task + "\n");
            }
            System.out.println("Tasks saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    // Load tasks from a file
    public void loadTasksFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String task;
            while ((task = reader.readLine()) != null) {
                tasks.add(task);
            }
            System.out.println("Tasks loaded from " + filename);
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }
    }
}


