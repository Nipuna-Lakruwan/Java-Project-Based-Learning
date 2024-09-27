import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListGUI {
    private TodoListManager toDoListManager;
    private JTextArea taskArea;
    private JTextField taskInput;
    private JTextField priorityInput;
    private JTextField categoryInput;

    public ToDoListGUI() {
        toDoListManager = new TodoListManager();
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("To-Do List Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        taskArea = new JTextArea();
        taskArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(taskArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        taskInput = new JTextField(20);
        priorityInput = new JTextField(3);
        categoryInput = new JTextField(10);
        JButton addButton = new JButton("Add Task");
        JButton viewButton = new JButton("View Tasks");
        JButton removeButton = new JButton("Remove Task");

        inputPanel.add(new JLabel("Task:"));
        inputPanel.add(taskInput);
        inputPanel.add(new JLabel("Priority (1-10):"));
        inputPanel.add(priorityInput);
        inputPanel.add(new JLabel("Category:"));
        inputPanel.add(categoryInput);
        inputPanel.add(addButton);
        inputPanel.add(viewButton);
        inputPanel.add(removeButton);

        frame.add(inputPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> addTask());
        viewButton.addActionListener(e -> viewTasks());
        removeButton.addActionListener(e -> removeTask());

        frame.setVisible(true);
    }

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

    private void viewTasks() {
        taskArea.setText("");
        toDoListManager.viewTasks();
    }

    private void removeTask() {
        String input = JOptionPane.showInputDialog("Enter task index to remove:");
        try {
            int index = Integer.parseInt(input) - 1; // Convert to zero-based index
            toDoListManager.removeTask(index);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input: Please enter a number.");
        }
    }
}