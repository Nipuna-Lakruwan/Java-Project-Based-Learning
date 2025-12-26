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