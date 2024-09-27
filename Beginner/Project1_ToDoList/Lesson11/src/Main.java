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
