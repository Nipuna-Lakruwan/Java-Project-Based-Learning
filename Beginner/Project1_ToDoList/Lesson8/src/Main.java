import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoListManager<String> toDoListManager = new TodoListManager<>();  // Managing String tasks
        String command;

        do {
            System.out.println("\nEnter a command (add/view/remove/complete/exit):");
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
                    try {
                        System.out.println("Enter the task number to remove:");
                        int removeTaskNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        toDoListManager.removeTask(removeTaskNumber);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.nextLine(); // Clear the invalid input
                    } catch (TaskNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "complete":
                    try {
                        System.out.println("Enter the task number to complete:");
                        int completeTaskNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        toDoListManager.completeTask(completeTaskNumber);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.nextLine(); // Clear the invalid input
                    }
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
