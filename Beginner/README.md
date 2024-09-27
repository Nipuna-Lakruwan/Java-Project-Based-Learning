# To-Do List Manager

## Project Description
A simple Java application to manage a list of tasks with a graphical user interface using Java Swing.

## Installation
1. Ensure you have Java and Apache Ant installed.
2. Clone this repository.
3. Navigate to the project directory.
4. Run the following command to build the project:
   ```bash
   ant
   ```

## Usage
- Run the application using the generated JAR file:
  ```bash
  java -jar dist/ToDoListManager.jar
  ```

## Features
- Add tasks with priority and category.
- View tasks in the list.
- Remove tasks.

## Troubleshooting
If you encounter issues, check the console output for error messages.

## Contribution
Feel free to fork the repository and submit pull requests for any improvements.

### Summary of Files
1. **`build.xml`**: Apache Ant build script.
2. **`README.md`**: Project documentation and usage instructions.
3. **`src/Main.java`**: Entry point of the application.
4. **`src/Task.java`**: Class representing a task.
5. **`src/TodoListManager.java`**: Class for managing tasks.
6. **`gui/ToDoListGUI.java`**: GUI implementation using Java Swing.

### Final Steps
1. Place all these files in their respective directories.
2. To compile and run the application, navigate to the project root directory in your terminal and execute:
   ```bash
   ant
   java -jar dist/ToDoListManager.jar
   ```

This setup provides a complete To-Do List Manager application with GUI functionality, adhering to the lessons you've learned. If you have any additional features or modifications in mind, feel free to ask! Happy coding!