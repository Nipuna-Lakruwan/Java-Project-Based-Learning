# Lesson 10: Unit Testing with JUnit

In this lesson, we will explore the importance of unit testing in software development and how to use JUnit, a popular testing framework for Java, to write and run tests for our To-Do List Manager.

## Objectives
- Understand the concept of unit testing and its benefits.
- Learn how to set up JUnit in your project.
- Write and run unit tests for the `TodoListManager` class.

## What is Unit Testing?
Unit testing is a software testing technique where individual units or components of a software application are tested in isolation to ensure that they are functioning correctly. The main benefits of unit testing include:

- **Early Bug Detection**: Finding and fixing bugs at an early stage of development.
- **Improved Code Quality**: Encourages developers to write cleaner and more modular code.
- **Facilitates Refactoring**: Ensures that changes or refactorings do not break existing functionality.

## Setting Up JUnit
To use JUnit, you need to add it as a dependency in your project. If you're using Maven, you can add the following to your `pom.xml`:

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

If you're not using Maven, you can download the JUnit jar file and add it to your project's build path.

## Writing Unit Tests
Now, let's write some unit tests for our `TodoListManager` class. Create a new file named `TodoListManagerTest.java` in your test directory.

### Example Test Cases
Here are some example test cases for the `TodoListManager`:

```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TodoListManagerTest {
    private TodoListManager<String> manager;

    @Before
    public void setUp() {
        manager = new TodoListManager<>();
    }

    @Test
    public void testAddTask() {
        manager.addTask("Task 1");
        assertEquals(1, manager.getTasks().size()); // Check if task is added
    }

    @Test
    public void testRemoveTask() {
        manager.addTask("Task 1");
        manager.removeTask(1);
        assertEquals(0, manager.getTasks().size()); // Check if task is removed
    }

    @Test
    public void testCompleteTask() {
        manager.addTask("Task 1");
        manager.completeTask(1);
        assertEquals(0, manager.getTasks().size()); // Check if task is completed and removed
    }
}
```

### Running Your Tests
You can run your JUnit tests using your IDE's built-in support for running tests or by using a build tool like Maven or Gradle. In most IDEs, right-click on the test file and select "Run".

## Conclusion
In this lesson, you learned the importance of unit testing and how to use JUnit to write and run tests for your Java applications. Writing tests helps ensure your code works as expected and improves code quality.

### Next Steps
- Explore more advanced features of JUnit, such as assertions, test suites, and parameterized tests.
- Consider using other testing frameworks like Mockito for mocking dependencies.

Happy coding!