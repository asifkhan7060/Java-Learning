package C_controlflow;

/**
 ====================================================
 LOOPS IN JAVA
 ====================================================

 Study : Looping Statements in Java

 🔹 What Are Loops?

 Loops are used to execute a block of code
 repeatedly until a specified condition becomes
 false.

 Instead of writing the same statements multiple
 times, a loop allows us to execute them
 automatically.

 Loops are also called Iteration Statements
 because they repeat a task multiple times.


 ====================================================
 Why Loops Are Needed?
 ====================================================

 Imagine printing "Hello" 100 times.

 Without Loops:
 System.out.println("Hello");
 System.out.println("Hello");
 ... 100 times

 With Loops:
 Only a few lines of code are needed.

 Loops reduce code duplication and make programs
 easier to maintain.


 ====================================================
 Types of Loops in Java
 ====================================================

 Java provides four main loops:

 1. for Loop
 Used when number of iterations is known.

 2. while Loop
 Used when iterations depend on a condition.

 3. do-while Loop
 Executes at least one time.

 4. Enhanced for-each Loop
 Used to traverse arrays and collections.


 ====================================================
 How Loops Work
 ====================================================

 Step 1:
 Loop starts.

 Step 2:
 Condition is checked.

 Step 3:
 If condition is true,
 loop body executes.

 Step 4:
 Condition is checked again.

 Step 5:
 Loop continues until condition
 becomes false.


 ====================================================
 Example 1 : for Loop
 ====================================================

 for(int i = 1; i <= 5; i++)
 {
 System.out.println(i);
 }

 Output:
 1 2 3 4 5


 ====================================================
 Example 2 : while Loop
 ====================================================

 int i = 1;

 while(i <= 5)
 {
 System.out.println(i);
 i++;
 }

 Output:
 1 2 3 4 5


 ====================================================
 Example 3 : do-while Loop
 ====================================================

 int i = 1;

 do
 {
 System.out.println(i);
 i++;
 }
 while(i <= 5);

 Output:
 1 2 3 4 5


 ====================================================
 Example 4 : Enhanced for-each Loop
 ====================================================

 int[] numbers = {10, 20, 30, 40, 50};

 for(int number : numbers)
 {
 System.out.println(number);
 }

 Output:
 10 20 30 40 50
 */

public class B_Loops {

    public static void main(String[] args) {

        // Example 1 : for Loop
        System.out.println("For Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Example 2 : while Loop
        System.out.println("\nWhile Loop:");

        int j = 1;

        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // Example 3 : do-while Loop
        System.out.println("\nDo-While Loop:");

        int k = 1;

        do {
            System.out.println(k);
            k++;
        }
        while (k <= 5);

        System.out.println("\nDo-While Loop - Case 2:");

        int z = 20;

        do {
            System.out.println(z);
            z++;
        }
        while (k <= 5);

        // Example 4 : Enhanced for-each Loop
        System.out.println("\nEnhanced For-Each Loop:");

        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}