
/*
2. LoopsExample.java
This file illustrates the different looping structures in Java: `for`, `while`, and `do-while` loops.
*/

// LoopsExample.java
public class LoopsExample {
    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int k = 0;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k < 5);
    }
}


/*
Summary
- ControlFlowExample.java demonstrates how to use conditional statements and a switch statement.
- LoopsExample.java illustrates the use of `for`, `while`, and `do-while` loops.
- These examples provide a foundation for understanding control flow and looping structures in Java.
*/