/*
1. EncapsulationExample.java
This file demonstrates the concept of encapsulation by creating a `BankAccount` class with private variables and public methods.
*/

// EncapsulationExample.java
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

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Current Balance: " + account.getBalance()); // Output: Current Balance: 1300.0
    }
}

/*
2. InheritanceExample.java
This file demonstrates the concept of inheritance with an `Animal` superclass and a `Dog` subclass.
*/

// InheritanceExample.java
public class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Output: This animal eats food.
        dog.bark(); // Output: The dog barks.
    }
}

/*
3. PolymorphismExample.java
This file shows polymorphism through method overriding with a `Cat` subclass that overrides the `eat` method.
*/

// PolymorphismExample.java
public class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("The cat eats fish.");
    }

    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.eat(); // Output: The cat eats fish.
    }
}

/*
4. InterfaceExample.java
This file demonstrates the concept of interfaces with an `Animal` interface and a `Bird` class that implements it.
*/

// InterfaceExample.java
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

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat(); // Output: The bird eats seeds.
        bird.sleep(); // Output: The bird sleeps in the nest.
    }
}

/*
5. AbstractClassExample.java
This file shows the concept of abstract classes with a `Shape` abstract class and a `Circle` subclass that implements the abstract method.
*/

// AbstractClassExample.java
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

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw(); // Output: Drawing a circle.
        circle.display(); // Output: This is a shape.
    }
}
/*
Summary
- EncapsulationExample.java illustrates encapsulation with a `BankAccount` class.
- InheritanceExample.java demonstrates inheritance with an `Animal` superclass and `Dog` subclass.
- PolymorphismExample.java shows method overriding with a `Cat` subclass.
- InterfaceExample.java demonstrates how to use interfaces with a `Bird` class.
- AbstractClassExample.java shows how to use abstract classes with a `Circle` subclass.
*/