package C_controlflow;

/**
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LOOPS IN JAVA<br>
 * ====================================================<br><br>
 *
 * Study : Looping Statements in Java<br><br>
 *
 * 🔹 What Are Loops?<br><br>
 *
 * Loops are used to execute a block of code
 * repeatedly until a specified condition becomes
 * false.<br><br>
 *
 * Instead of writing the same statements multiple
 * times, a loop allows us to execute them
 * automatically.<br><br>
 *
 * Loops are also called Iteration Statements
 * because they repeat a task multiple times.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Why Loops Are Needed?<br>
 * ====================================================<br><br>
 *
 * Imagine printing "Hello" 100 times.<br><br>
 *
 * Without Loops:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Hello");<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Hello");<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;... 100 times<br><br>
 *
 * With Loops:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Only a few lines of code are needed.<br><br>
 *
 * Loops reduce code duplication and make programs
 * easier to maintain.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Types of Loops in Java<br>
 * ====================================================<br><br>
 *
 * Java provides four main loops:<br><br>
 *
 * 1. for Loop<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Used when number of iterations is known.<br><br>
 *
 * 2. while Loop<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Used when iterations depend on a condition.<br><br>
 *
 * 3. do-while Loop<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Executes at least one time.<br><br>
 *
 * 4. Enhanced for-each Loop<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Used to traverse arrays and collections.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;How Loops Work<br>
 * ====================================================<br><br>
 *
 * Step 1:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Loop starts.<br><br>
 *
 * Step 2:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Condition is checked.<br><br>
 *
 * Step 3:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;If condition is true,
 * &nbsp;&nbsp;&nbsp;&nbsp;loop body executes.<br><br>
 *
 * Step 4:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Condition is checked again.<br><br>
 *
 * Step 5:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Loop continues until condition
 * &nbsp;&nbsp;&nbsp;&nbsp;becomes false.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Example 1 : for Loop<br>
 * ====================================================<br><br>
 *
 * for(int i = 1; i <= 5; i++)<br>
 * {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println(i);<br>
 * }<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;1 2 3 4 5<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Example 2 : while Loop<br>
 * ====================================================<br><br>
 *
 * int i = 1;<br><br>
 *
 * while(i <= 5)<br>
 * {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println(i);<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;i++;<br>
 * }<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;1 2 3 4 5<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Example 3 : do-while Loop<br>
 * ====================================================<br><br>
 *
 * int i = 1;<br><br>
 *
 * do<br>
 * {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println(i);<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;i++;<br>
 * }<br>
 * while(i <= 5);<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;1 2 3 4 5<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Example 4 : Enhanced for-each Loop<br>
 * ====================================================<br><br>
 *
 * int[] numbers = {10,20,30,40,50};<br><br>
 *
 * for(int number : numbers)<br>
 * {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println(number);<br>
 * }<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;10 20 30 40 50<br><br>
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