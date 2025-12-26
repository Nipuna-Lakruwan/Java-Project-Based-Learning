// ControlFlowExample.java

public class ControlFlowExample {
    public static void main(String[] args) {
        // Conditional Statements
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Switch Statement
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well done!");
                break;
            case 'C':
                System.out.println("Good!");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}


/*
Summary
- ControlFlowExample.java demonstrates how to use conditional statements and a switch statement.
- LoopsExample.java illustrates the use of `for`, `while`, and `do-while` loops.
- These examples provide a foundation for understanding control flow and looping structures in Java.
*/