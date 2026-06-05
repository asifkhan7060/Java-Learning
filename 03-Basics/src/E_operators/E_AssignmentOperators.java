package E_operators;

/**
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ASSIGNMENT OPERATORS IN JAVA<br>
 * ====================================================<br><br>
 *
 * Study : Assignment Operators (=, +=, -=, *=, /=, %=) in Java<br><br>
 *
 * 🔹 What Are Assignment Operators?<br><br>
 *
 * Assignment Operators are used to assign values
 * to variables.<br><br>
 *
 * They can also perform an operation and assign
 * the result back to the same variable.<br><br>
 *
 * Example:<br><br>
 *
 * int a = 10;<br><br>
 *
 * Here:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;a → Variable<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;= → Assignment Operator<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;10 → Value Assigned<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;1) Assignment Operator (=)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Assigns a value to a variable.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;variable = value<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;int x = 10;<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;x = 10<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2) Add and Assign Operator (+=)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Adds a value and assigns the result.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;variable += value<br><br>
 *
 * Equivalent To:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;variable = variable + value<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;x += 5;<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;3) Subtract and Assign Operator (-=)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Subtracts a value and assigns the result.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;variable -= value<br><br>
 *
 * Equivalent To:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;variable = variable - value<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;x -= 5;<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;4) Multiply and Assign Operator (*=)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Multiplies a value and assigns the result.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;variable *= value<br><br>
 *
 * Equivalent To:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;variable = variable * value<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;x *= 5;<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;5) Divide and Assign Operator (/=)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Divides a value and assigns the result.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;variable /= value<br><br>
 *
 * Equivalent To:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;variable = variable / value<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;x /= 5;<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;6) Modulus and Assign Operator (%=)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Finds remainder and assigns the result.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;variable %= value<br><br>
 *
 * Equivalent To:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;variable = variable % value<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;x %= 3;<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Applications of Assignment Operators<br>
 * ====================================================<br><br>
 *
 * Used in:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Calculations<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Counters<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Loops<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Score Tracking<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Updating Variables<br><br>
 *
 */

public class E_AssignmentOperators {

    public static void main(String[] args) {

        int x = 10;

        // Assignment
        x = 10;
        System.out.println("Assignment (=) : " + x);

        // Add and Assign
        x += 5;
        System.out.println("Add and Assign (+=) : " + x);

        // Subtract and Assign
        x -= 3;
        System.out.println("Subtract and Assign (-=) : " + x);

        // Multiply and Assign
        x *= 2;
        System.out.println("Multiply and Assign (*=) : " + x);

        // Divide and Assign
        x /= 4;
        System.out.println("Divide and Assign (/=) : " + x);

        // Modulus and Assign
        x %= 3;
        System.out.println("Modulus and Assign (%=) : " + x);
    }
}