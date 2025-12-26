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
