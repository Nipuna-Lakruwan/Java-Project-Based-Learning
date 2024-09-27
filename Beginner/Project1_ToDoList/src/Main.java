import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        String command = "";

        System.out.println("Welcome to the To-Do List Application!");

        do {
            try {
                System.out.println("\nEnter a command (add/view/remove/complete/exit):");
                command = scanner.nextLine();

                switch (command) {
                    case "add":
                        System.out.println("Enter the task:");
                        String task = scanner.nextLine();
                        todoList.addTask(task);
                        break;
                    case "view":
                        todoList.viewTasks();
                        break;
                    case "remove":
                        System.out.println("Enter the task number to remove:");
                        int taskNumber = scanner.nextInt();
                        scanner.nextLine();
                        todoList.removeTask(taskNumber);
                        break;
                    case "complete":
                        System.out.println("Enter the task number to complete:");
                        int completeTaskNumber = scanner.nextInt();
                        scanner.nextLine();
                        todoList.completeTask(completeTaskNumber);
                        break;
                    case "exit":
                        System.out.println("Exiting the application");
                        break;
                    default:
                        System.out.println("Invalid command");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                scanner.nextLine();
            }
        } while (!command.equals("exit"));

    }
}