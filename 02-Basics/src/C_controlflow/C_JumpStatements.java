package C_controlflow;

/**
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JUMP STATEMENTS IN JAVA<br>
 * ====================================================<br><br>
 *
 * Study : Jump Statements in Java<br><br>
 *
 * 🔹 What Are Jump Statements?<br><br>
 *
 * Jump Statements are used to alter the normal
 * flow of program execution.<br><br>
 *
 * They allow the program to immediately move
 * to another part of the code instead of
 * continuing sequential execution.<br><br>
 *
 * Jump Statements are commonly used with loops
 * and switch statements.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Why Jump Statements Are Needed?<br>
 * ====================================================<br><br>
 *
 * Sometimes we need to:<br><br>
 *
 * ✓ Exit a loop immediately.<br>
 * ✓ Skip a particular iteration.<br>
 * ✓ Improve efficiency of execution.<br>
 * ✓ Control loop behavior dynamically.<br><br>
 *
 * Jump statements help us achieve these tasks
 * easily.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Types of Jump Statements<br>
 * ====================================================<br><br>
 *
 * Java provides two major Jump Statements:<br><br>
 *
 * 1. break Statement<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Terminates loop or switch immediately.<br><br>
 *
 * 2. continue Statement<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Skips current iteration and moves to
 * &nbsp;&nbsp;&nbsp;&nbsp;the next iteration.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;How Jump Statements Work<br>
 * ====================================================<br><br>
 *
 * break Statement:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Stops execution of the loop instantly.<br><br>
 *
 * continue Statement:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Skips remaining code inside the current
 * &nbsp;&nbsp;&nbsp;&nbsp;iteration and proceeds with the next one.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Example 1 : break Statement<br>
 * ====================================================<br><br>
 *
 * for(int i = 1; i <= 10; i++)<br>
 * {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;if(i == 5)<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;break;<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println(i);<br>
 * }<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;1 2 3 4<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Example 2 : continue Statement<br>
 * ====================================================<br><br>
 *
 * for(int i = 1; i <= 5; i++)<br>
 * {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;if(i == 3)<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;continue;<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println(i);<br>
 * }<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;1 2 4 5<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Difference Between break and continue<br>
 * ====================================================<br><br>
 *
 * break:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Terminates the entire loop.<br><br>
 *
 * continue:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Skips only the current iteration.<br><br>
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