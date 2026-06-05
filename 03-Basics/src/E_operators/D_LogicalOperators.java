package E_operators;

/**
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LOGICAL OPERATORS IN JAVA<br>
 * ====================================================<br><br>
 *
 * Study : Logical Operators (&&, ||, !) in Java<br><br>
 *
 * 🔹 What Are Logical Operators?<br><br>
 *
 * Logical Operators are used to combine or manipulate
 * boolean expressions (true or false values).<br><br>
 *
 * The result of every logical operation is either:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;true<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;false<br><br>
 *
 * Logical Operators are commonly used in:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- if statements<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- if-else statements<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- loops<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- decision making<br><br>
 *
 * Example:<br><br>
 *
 * boolean isAdult = true;<br>
 * boolean hasLicense = true;<br><br>
 *
 * Here:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;isAdult and hasLicense → Operands<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&& → Logical Operator<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;1) Logical AND Operator (&&)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Returns true only when both conditions are true.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;condition1 && condition2<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;(10 > 5) && (20 > 10)<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;true<br><br>
 *
 * Truth Table:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;true && true → true<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;true && false → false<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;false && true → false<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;false && false → false<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2) Logical OR Operator (||)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Returns true if at least one condition is true.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;condition1 || condition2<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;(10 > 5) || (20 < 10)<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;true<br><br>
 *
 * Truth Table:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;true || true → true<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;true || false → true<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;false || true → true<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;false || false → false<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;3) Logical NOT Operator (!)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Reverses the boolean value.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;!condition<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;!(10 > 5)<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;false<br><br>
 *
 * Truth Table:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;!true → false<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;!false → true<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Short-Circuit Evaluation<br>
 * ====================================================<br><br>
 *
 * Java uses Short-Circuit Evaluation.<br><br>
 *
 * For AND (&&):<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;If the first condition is false,
 * &nbsp;&nbsp;&nbsp;&nbsp;Java does not evaluate the second condition.<br><br>
 *
 * For OR (||):<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;If the first condition is true,
 * &nbsp;&nbsp;&nbsp;&nbsp;Java does not evaluate the second condition.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Applications of Logical Operators<br>
 * ====================================================<br><br>
 *
 * Used in:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Age Verification<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Login Systems<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Eligibility Checking<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Access Control<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Decision Making<br><br>
 *
 */

public class D_LogicalOperators {

    public static void main(String[] args) {

        boolean isAdult = true;
        boolean hasLicense = true;

        // Logical AND
        boolean andResult = isAdult && hasLicense;
        System.out.println("Logical AND (true && true) = " + andResult);

        // Logical OR
        boolean orResult = isAdult || false;
        System.out.println("Logical OR (true || false) = " + orResult);

        // Logical NOT
        boolean notResult = !isAdult;
        System.out.println("Logical NOT (!true) = " + notResult);

        // Practical Example
        boolean canDrive = isAdult && hasLicense;
        System.out.println("Can Drive = " + canDrive);
    }
}