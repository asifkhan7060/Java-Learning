package C_controlflow;

/**
 ====================================================
 JUMP STATEMENTS IN JAVA
 ====================================================

 Study : Jump Statements in Java

 🔹 What Are Jump Statements?

 Jump Statements are used to alter the normal
 flow of program execution.

 They allow the program to immediately move
 to another part of the code instead of
 continuing sequential execution.

 Jump Statements are commonly used with loops
 and switch statements.


 ====================================================
 Why Jump Statements Are Needed?
 ====================================================

 Sometimes we need to:

 ✓ Exit a loop immediately.
 ✓ Skip a particular iteration.
 ✓ Improve efficiency of execution.
 ✓ Control loop behavior dynamically.

 Jump statements help us achieve these tasks
 easily.


 ====================================================
 Types of Jump Statements
 ====================================================

 Java provides two major Jump Statements:

 1. break Statement
 Terminates loop or switch immediately.

 2. continue Statement
 Skips current iteration and moves to
 the next iteration.


 ====================================================
 How Jump Statements Work
 ====================================================

 break Statement:
 Stops execution of the loop instantly.

 continue Statement:
 Skips remaining code inside the current
 iteration and proceeds with the next one.


 ====================================================
 Example 1 : break Statement
 ====================================================

 for(int i = 1; i <= 10; i++)
 {
 if(i == 5)
 break;

 System.out.println(i);
 }

 Output:
 1 2 3 4


 ====================================================
 Example 2 : continue Statement
 ====================================================

 for(int i = 1; i <= 5; i++)
 {
 if(i == 3)
 continue;

 System.out.println(i);
 }

 Output:
 1 2 4 5


 ====================================================
 Difference Between break and continue
 ====================================================

 break:
 Terminates the entire loop.

 continue:
 Skips only the current iteration.
 */

public class C_JumpStatements {

    public static void main(String[] args) {

        // Example 1 : break Statement
        System.out.println("Break Statement:");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break; // output until 5
            }

            System.out.println(i);
        }

        // Example 2 : continue Statement
        System.out.println("\nContinue Statement:");

        for (int i = 1; i <= 5; i++) {

            if (i == 3) { // 3 gets skipped
                continue;
            }

            System.out.println(i);
        }
    }
}