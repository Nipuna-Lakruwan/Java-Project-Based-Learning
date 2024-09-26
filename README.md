# Java Project-Based Learning

Welcome to the Java Project-Based Learning repository! This repo is designed to teach you Java by building real-world projects, from beginner to advanced level.

## 📚 Learning Path

We’ll start with basic Java concepts and progressively build up to advanced topics like multithreading, design patterns, and web development using Spring Boot.

### 🛠 Projects Overview:

1. **Beginner**  
   - **To-Do List (Console-based)**: Practice basic Java concepts such as control flow, functions, and OOP by building a simple to-do list app.

2. **Intermediate**  
   - **Bank Management System**: Manage bank accounts and transactions using Java collections, file I/O, and exception handling.

3. **Advanced**  
   - **Library Management System (with Database)**: Implement a full CRUD system interacting with a MySQL database using JDBC.

4. **Web Development**  
   - **E-Commerce API (Spring Boot)**: Create a REST API to manage products, users, and orders using Spring Boot.

5. **Final Project**  
   - **Full-Stack Task Manager**: Build a full-stack task management app with a Java backend and a front-end in React/Angular.

---

### 🧑‍💻 How to Use This Repository

1. Clone the repository:  
   ```
   git clone https://github.com/nipuna-lakruwan/Java-Project-Based-Learning.git
   ```

2.	Navigate to the project folder for the desired      level and follow the instructions in the README.md inside each folder. For example, to start with the first project:

   ```
   cd Beginner/Project1_ToDoList
   ```

3.	Compile and run the project using your favorite IDE (e.g., IntelliJ IDEA, Eclipse) or command line.

---

## 🔧 Requirements

Each project may have different requirements depending on its level of complexity. Below are the basic tools and software you need to install based on the project you are working on:

### 1. **General Requirements (All Levels)**

- **Java Development Kit (JDK)**: You'll need to have Java installed on your machine to compile and run the Java programs.
  - **Download JDK**: [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)
  - Make sure to set the `JAVA_HOME` environment variable and add the `bin` directory to your `PATH`.

- **IDE**: You can use any IDE or text editor for writing and running Java code. Here are some options:
  - **IntelliJ IDEA**: [Download IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
  - **Eclipse**: [Download Eclipse](https://www.eclipse.org/downloads/)
  - **VS Code with Java Extensions**: [Download VS Code](https://code.visualstudio.com/Download)

### 2. **Intermediate Requirements**

- **MySQL**: For projects like the Library Management System, you’ll need a MySQL database to store and manage data.
  - **Download MySQL**: [https://dev.mysql.com/downloads/](https://dev.mysql.com/downloads/)
  - You can also use **XAMPP** or **MAMP** for local development with MySQL.

- **JDBC Driver**: If you are using MySQL, you'll need the MySQL JDBC driver to connect Java to your database.
  - **Download MySQL JDBC Connector**: [https://dev.mysql.com/downloads/connector/j/](https://dev.mysql.com/downloads/connector/j/)

### 3. **Advanced & Web Development Requirements**

- **Spring Boot**: For building web applications, you will need Spring Boot and the associated dependencies. Most dependencies will be managed using Maven or Gradle.
  - **Spring Boot Documentation**: [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)
  - Maven is required to manage dependencies for Spring Boot projects. [Download Maven](https://maven.apache.org/install.html)

- **Postman or REST Client**: For testing REST APIs built using Spring Boot, you can use Postman or any REST client of your choice.
  - **Download Postman**: [https://www.postman.com/downloads/](https://www.postman.com/downloads/)

- **Node.js & NPM (for Final Project)**: If you’re working on the full-stack task management app, you'll need Node.js and NPM for the front-end.
  - **Download Node.js**: [https://nodejs.org/en/](https://nodejs.org/en/)

---

Follow the instructions in each project’s `README.md` for specific setup steps. Some projects will include dependencies or database setup instructions that need to be followed before running the project.

## 📖 Projects Breakdown

Each project folder includes the following:

- **src/**: Contains the source code for the project, written in Java.
- **README.md**: A step-by-step guide that explains the Java concepts used in the project, how to set it up, and how to run it.
- **Dependencies**: Any additional libraries, frameworks, or external tools needed to complete the project will be listed in the project’s README.

Here is a breakdown of each project:

### 1. **Beginner Projects**

- **Project: To-Do List (Console-based)**
  - **Key Concepts**: Control flow (if/else), loops, functions, and basic OOP principles (Classes, Objects).
  - **Objective**: Build a simple to-do list application where users can add, view, and delete tasks from the console.

### 2. **Intermediate Projects**

- **Project: Bank Management System**
  - **Key Concepts**: Java Collections (ArrayList, HashMap), file I/O, exception handling, OOP (inheritance, polymorphism).
  - **Objective**: Create a system where users can manage bank accounts, view balance, and perform transactions like deposits and withdrawals. Data persistence using file I/O will be implemented.

### 3. **Advanced Projects**

- **Project: Library Management System (with Database)**
  - **Key Concepts**: JDBC, MySQL database connectivity, SQL queries, CRUD operations (Create, Read, Update, Delete).
  - **Objective**: Implement a full-featured library management system where users can add new books, update records, and remove books from the database. This project introduces database management with Java.

### 4. **Web Development Projects**

- **Project: E-Commerce API (Spring Boot)**
  - **Key Concepts**: REST API, Spring Boot, JSON, HTTP Methods (GET, POST, PUT, DELETE).
  - **Objective**: Create a RESTful API for managing products, users, and orders in an e-commerce system. This project introduces Spring Boot for building web applications.

### 5. **Final Project: Full-Stack Task Manager**

- **Project: Full-Stack Task Manager**
  - **Key Concepts**: Spring Boot (backend), React/Angular (frontend), REST API, JWT authentication, database management (MySQL).
  - **Objective**: Build a full-stack task manager application where users can register, log in, and manage tasks. The backend will be built in Java using Spring Boot, and the front-end will be implemented in React or Angular.

---

Each project is designed to be progressively more challenging, allowing you to build on previous concepts and push your skills further with every new task. Make sure to follow the `README.md` files within each project folder for detailed setup instructions.

## 💡 Project Levels

The projects in this repository are organized into different levels to facilitate a gradual learning experience. Each level builds on the previous one, helping you develop your Java skills progressively.

### 1. **Beginner Level**

- **Focus**: Learn basic Java syntax, control flow, and fundamental Object-Oriented Programming (OOP) concepts.
- **Skills Developed**:
  - Understanding of variables, data types, and operators.
  - Mastery of control structures (if statements, loops).
  - Basic OOP principles (classes, objects, inheritance).
- **Project Examples**:
  - To-Do List (Console-based)

### 2. **Intermediate Level**

- **Focus**: Deepen your understanding of Java collections, file I/O, and exception handling.
- **Skills Developed**:
  - Working with Java Collections Framework (lists, maps).
  - File input and output operations for data persistence.
  - Exception handling to manage errors gracefully.
- **Project Examples**:
  - Bank Management System

### 3. **Advanced Level**

- **Focus**: Build complex systems that integrate databases and advanced Java concepts like multithreading and generics.
- **Skills Developed**:
  - Database connectivity and management using JDBC.
  - Advanced OOP principles (polymorphism, encapsulation).
  - Understanding and implementing multithreading in Java.
- **Project Examples**:
  - Library Management System (with Database)

### 4. **Web Development Level**

- **Focus**: Develop web applications using Java frameworks like Spring Boot, focusing on RESTful API design.
- **Skills Developed**:
  - Building REST APIs and understanding client-server architecture.
  - Working with JSON and HTTP methods.
  - Using Spring Boot for rapid application development.
- **Project Examples**:
  - E-Commerce API (Spring Boot)

### 5. **Final Project Level**

- **Focus**: Combine backend and frontend technologies to create full-stack applications.
- **Skills Developed**:
  - Integration of frontend frameworks (React/Angular) with a Java backend.
  - Implementing user authentication and managing state in web applications.
  - Full-stack application deployment and management.
- **Project Examples**:
  - Full-Stack Task Manager

---

As you progress through these levels, you'll gain hands-on experience with each key area of Java development, building confidence and competence as you go. Be sure to complete each project before moving on to the next level to maximize your learning!

## 📦 Contributing

We welcome contributions to this repository! If you have ideas for new projects, improvements, or bug fixes, please feel free to get involved. Follow these steps to contribute:

1. **Fork the Repository**: Click on the "Fork" button at the top right corner of this repository to create your own copy.

2. **Create a New Branch**: Before making changes, create a new branch for your feature or fix. You can do this with the following command:
   ```
   git checkout -b feature/YourFeatureName
   ```

3. **Make Your Changes**: Implement your changes in your local copy of the repository. Ensure that your code adheres to the existing style and conventions.

4. **Commit Your Changes**: Once you’ve made your changes, commit them with a descriptive message:
   ```
   git commit -m "Add a brief description of your changes"
   ```

5. **Push Your Changes**: Push your changes to your forked repository:
   ```
   git push origin feature/YourFeatureName
   ```

6. **Open a Pull Request**: Go to the original repository where you want to propose your changes. Click on the “Pull Requests” tab, then click the “New Pull Request” button. Select your branch and provide a description of your changes.

7. **Wait for Review**: After submitting your pull request, it will be reviewed by the repository maintainers. They may ask for changes or provide feedback. Please be responsive to any comments.

### Guidelines for Contributions

To maintain a high standard of quality and collaboration in this repository, please adhere to the following guidelines when contributing:

1. **Code Quality**:
   - Write clean, readable, and maintainable code. Follow Java naming conventions and best practices.
   - Use consistent formatting and indentation throughout your code.

2. **Documentation**:
   - Document your code with comments where necessary, explaining complex logic and decisions.
   - Update the README.md files in your project directories to include information about any new features or changes you implement.

3. **Testing**:
   - Include tests for any new features or changes you make. Aim for a good balance of unit tests and integration tests to ensure functionality.
   - If applicable, provide instructions on how to run the tests in the README.md of the relevant project.

4. **Respect the Project Structure**:
   - Follow the existing directory structure and naming conventions to maintain consistency across projects.
   - When adding new projects, ensure they fit the overall learning path and project organization.

5. **Issue Tracking**:
   - Before starting work on a significant change or new project, open an issue to discuss your ideas with the maintainers and community.
   - If you find bugs or have feature requests, please log them in the issues section of the repository.

6. **Engage and Collaborate**:
   - Be respectful and constructive in discussions and code reviews.
   - Provide feedback and support to other contributors, fostering a collaborative environment.

7. **Licensing**:
   - Ensure that any code or resources you contribute comply with the repository's licensing terms. If you're unsure, please ask for clarification before submitting your changes.

8. **Sign Your Work**:
   - If applicable, sign your commits with your name and email to give credit for your contributions.

By following these guidelines, you help create a positive and productive environment for everyone involved. Thank you for contributing to the Java Project-Based Learning repository!

## ⭐️ Support

Thank you for exploring the Java Project-Based Learning repository! If you find this resource helpful, here are a few ways you can show your support:

1. **Star the Repository**: If you appreciate the content and find it useful, consider starring ⭐️ this repository. This helps others discover it and encourages continuous improvement.

2. **Spread the Word**: Share this repository with friends, classmates, or anyone interested in learning Java. You can do this through social media, forums, or study groups.

3. **Contribute**: If you have ideas for new projects, improvements, or bug fixes, don’t hesitate to contribute! Your contributions can make a significant difference in the learning journey of others.

4. **Provide Feedback**: We value your feedback! If you have suggestions for improving the repository or enhancing the learning experience, please open an issue or reach out through the discussion section.

5. **Join the Community**: Engage with other learners and contributors. Join discussions, ask questions, and share your projects to inspire and be inspired.

---

If you have any specific questions or need assistance, feel free to reach out through the issues section. We’re here to help you on your journey to mastering Java!

Happy coding!