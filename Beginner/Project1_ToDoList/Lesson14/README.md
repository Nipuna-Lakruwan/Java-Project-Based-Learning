# Lesson 14: Adding a User Interface

In this lesson, we will enhance the To-Do List Manager by adding a graphical user interface (GUI) using Java Swing. A GUI will make our application more user-friendly and visually appealing, allowing users to interact with the To-Do List Manager more easily.

## Objectives
- Understand the basics of Java Swing and its components.
- Implement a simple GUI for the To-Do List Manager.
- Connect the GUI with the existing functionality of the application.

## Introduction to Java Swing
Java Swing is a part of Java Foundation Classes (JFC) that provides a set of GUI components for Java applications. Some of the commonly used Swing components include:
- `JFrame`: A window with a title and border.
- `JPanel`: A container that can hold components.
- `JButton`: A button that can trigger actions.
- `JTextField`: A field for user input.
- `JTextArea`: A multi-line area for displaying or entering text.
- `JList`: A component for displaying a list of items.

## Setting Up the GUI
We will create a simple GUI for our To-Do List Manager that allows users to add, view, and remove tasks. 

### Creating the Main Frame
Start by creating a new class named `ToDoListGUI` that will contain the main application window.

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListGUI {
    private TodoListManager<String> toDoListManager;
    private JTextArea taskArea;
    private JTextField taskInput;
    private JTextField priorityInput;
    private JTextField categoryInput;

    public ToDoListGUI() {
        toDoListManager = new TodoListManager<>();
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
        inputPanel.add(new JLabel("Priority (1-High):"));
        inputPanel.add(priorityInput);
        inputPanel.add(new JLabel("Category:"));
        inputPanel.add(categoryInput);
        inputPanel.add(addButton);
        inputPanel.add(viewButton);
        inputPanel.add(removeButton);

        frame.add(inputPanel, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewTasks();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeTask();
            }
        });

        frame.setVisible(true);
    }

    private void addTask() {
        String task = taskInput.getText();
        int priority = Integer.parseInt(priorityInput.getText());
        String category = categoryInput.getText();
        toDoListManager.addTask(task, priority, category);
        taskInput.setText("");
        priorityInput.setText("");
        categoryInput.setText("");
    }

    private void viewTasks() {
        taskArea.setText("");
        toDoListManager.viewTasks();
    }

    private void removeTask() {
        // Implement remove task functionality
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ToDoListGUI());
    }
}
```

### Connecting GUI to Functionality
- **Adding Tasks**: When the user clicks the "Add Task" button, the `addTask` method will retrieve the input values and call the `addTask` method of `TodoListManager`.
- **Viewing Tasks**: The `viewTasks` method updates the `taskArea` with the list of tasks from `TodoListManager`.
- **Removing Tasks**: Implement the functionality to remove tasks from the list.

### Conclusion
By adding a graphical user interface to our To-Do List Manager, we have improved the user experience significantly. Users can now easily add, view, and manage their tasks without dealing with command-line inputs.

### Next Steps
- Implement the functionality to remove tasks from the list in the GUI.
- Explore additional GUI features, such as task editing and sorting.

Happy coding!