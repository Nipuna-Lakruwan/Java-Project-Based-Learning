/*
1. FunctionExample.java
This file demonstrates how to define, invoke, and work with methods, including using parameters and return types.
*/

// FunctionExample.java
public class FunctionExample {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to display user information
    public void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        FunctionExample example = new FunctionExample(); // Create an instance of the class

        // Invoking the add method
        int sum = example.add(5, 10);
        System.out.println("Sum: " + sum); // Output: Sum: 15

        // Invoking the displayInfo method
        example.displayInfo("John", 25);
    }
}

/*
2. MethodOverloadingExample.java
This file illustrates method overloading by defining multiple methods with the same name but different parameters.
*/

// MethodOverloadingExample.java
public class MethodOverloadingExample {

    // Overloaded method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Overloaded method to multiply two doubles
    public double multiply(double a, double b) {
        return a * b;
    }

    // Overloaded method to multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample(); // Create an instance of the class

        // Invoking the overloaded multiply methods
        System.out.println("Multiply two integers: " + example.multiply(5, 10)); // Output: 50
        System.out.println("Multiply two doubles: " + example.multiply(5.5, 2.0)); // Output: 11.0
        System.out.println("Multiply three integers: " + example.multiply(2, 3, 4)); // Output: 24
    }
}
/*
Summary
- FunctionExample.java demonstrates how to define and invoke methods, including using parameters and return types.
- MethodOverloadingExample.java illustrates method overloading with multiple methods having the same name but different parameters.
*/