import java.util.ArrayList;
import java.util.HashMap;

public class TodoListManager {
    // Using ArrayList to Manage Tasks
    /*private ArrayList<String> tasks;

    public TodoListManager() {
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
    } */

    // Using HashSet for Unique Tasks
    /* private HashSet<String> tasks;

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
    } */

    // Using HashMap for Categorized Tasks
    private final HashMap<String, ArrayList<String>> tasks;

    public TodoListManager() {
        tasks = new HashMap<>();
    }

    public void addTask(String category) {
        String task = "";
        tasks.computeIfAbsent(category, _ -> new ArrayList<>()).add(task);
        System.out.println("Task added to " + category + ": " + task);
    }

    public void viewTasks() {
        String category = "";
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