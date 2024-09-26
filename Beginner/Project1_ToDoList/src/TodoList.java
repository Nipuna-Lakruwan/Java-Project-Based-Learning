import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void viewTasks(){
        System.out.println("Your To-Do- List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void removeTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            String removedTask = tasks.remove(index - 1);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid task number.");
        }
    }
    public void completeTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            System.out.println("Task completed: " + tasks.get(index - 1));
            tasks.remove(index - 1); // Remove the task after completion
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
