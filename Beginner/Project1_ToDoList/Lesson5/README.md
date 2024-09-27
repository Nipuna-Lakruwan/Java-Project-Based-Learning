# Lesson 5: Object-Oriented Programming Concepts

In this lesson, we will delve into the core concepts of Object-Oriented Programming (OOP) in Java. OOP is a programming paradigm that uses "objects" to represent data and methods to manipulate that data, enabling more modular and maintainable code.

## Objectives
- Understand the principles of OOP: encapsulation, inheritance, and polymorphism.
- Learn how to create and use classes and objects in Java.
- Explore the concept of interfaces and abstract classes.

## Key Concepts of OOP

### 1. Encapsulation
Encapsulation is the practice of wrapping data (variables) and methods (functions) that operate on the data into a single unit called a class. It restricts direct access to some of the object's components, which can prevent the accidental modification of data.

#### Example of Encapsulation
```java
public class BankAccount {
    private double balance; // private variable

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

### 2. Inheritance
Inheritance allows one class (subclass) to inherit fields and methods from another class (superclass). This promotes code reuse and establishes a hierarchical relationship between classes.

#### Example of Inheritance
```java
public class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}
```

### 3. Polymorphism
Polymorphism allows methods to do different things based on the object it is acting upon. It can be achieved through method overriding and method overloading.

#### Method Overriding Example
```java
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("The cat eats fish.");
    }
}
```

### 4. Interfaces
An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors.

#### Example of an Interface
```java
public interface Animal {
    void eat();
    void sleep();
}

public class Bird implements Animal {
    public void eat() {
        System.out.println("The bird eats seeds.");
    }

    public void sleep() {
        System.out.println("The bird sleeps in the nest.");
    }
}
```

### 5. Abstract Classes
An abstract class is a class that cannot be instantiated on its own and can have abstract methods (methods without a body) that must be implemented by subclasses.

#### Example of an Abstract Class
```java
public abstract class Shape {
    public abstract void draw(); // abstract method

    public void display() {
        System.out.println("This is a shape.");
    }
}

public class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
```

## Conclusion
In this lesson, you learned the key principles of Object-Oriented Programming: encapsulation, inheritance, polymorphism, interfaces, and abstract classes. Understanding these concepts is crucial for designing robust and maintainable software.

### Next Steps
- Practice creating your own classes and objects.
- Experiment with inheritance and polymorphism in your Java applications.

Happy coding!