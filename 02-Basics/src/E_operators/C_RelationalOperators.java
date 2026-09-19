
package E_operators;

/**
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RELATIONAL OPERATORS IN JAVA<br>
 * ====================================================<br><br>
 *
 * Study : Relational Operators (==, !=, >, <, >=, <=) in Java<br><br>
 *
 * 🔹 What Are Relational Operators?<br><br>
 *
 * Relational Operators are used to compare two values.<br><br>
 *
 * The result of every relational operation is either:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;true<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;false<br><br>
 *
 * Example:<br><br>
 *
 * int a = 10;<br>
 * int b = 5;<br><br>
 *
 * Here:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;a and b → Operands<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;> → Relational Operator<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;1) Equal To Operator (==)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Checks whether two values are equal.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;operand1 == operand2<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;10 == 10<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;true<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2) Not Equal To Operator (!=)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Checks whether two values are not equal.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;operand1 != operand2<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;10 != 5<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;true<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;3) Greater Than Operator (>)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Checks whether the left operand is greater than the right operand.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;operand1 > operand2<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;10 > 5<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;true<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;4) Less Than Operator (<)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Checks whether the left operand is less than the right operand.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;operand1 < operand2<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;10 < 5<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;false<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;5) Greater Than or Equal To (>=)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Checks whether the left operand is greater than
 * &nbsp;&nbsp;&nbsp;&nbsp;or equal to the right operand.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;operand1 >= operand2<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;10 >= 10<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;true<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;6) Less Than or Equal To (<=)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Checks whether the left operand is less than
 * &nbsp;&nbsp;&nbsp;&nbsp;or equal to the right operand.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;operand1 <= operand2<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;5 <= 10<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;true<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Important Note About ==<br>
 * ====================================================<br><br>
 *
 * "=" is Assignment Operator.<br>
 * "==" is Relational Operator.<br><br>
 *
 * Example:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;int a = 10; &nbsp;&nbsp;&nbsp;&nbsp;// Assignment<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;(a == 10) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// Comparison<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Applications of Relational Operators<br>
 * ====================================================<br><br>
 *
 * Used in:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- if statements<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- if-else statements<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- loops<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- decision making<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- logical expressions<br><br>
 *
 */

public class C_RelationalOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Equal To
        boolean equal = (a == b);
        System.out.println("Equal To (10 == 5) = " + equal);

        // Not Equal To
        boolean notEqual = (a != b);
        System.out.println("Not Equal To (10 != 5) = " + notEqual);

        // Greater Than
        boolean greaterThan = (a > b);
        System.out.println("Greater Than (10 > 5) = " + greaterThan);

        // Less Than
        boolean lessThan = (a < b);
        System.out.println("Less Than (10 < 5) = " + lessThan);

        // Greater Than or Equal To
        boolean greaterThanEqual = (a >= b);
        System.out.println("Greater Than or Equal To (10 >= 5) = " + greaterThanEqual);

        // Less Than or Equal To
        boolean lessThanEqual = (a <= b);
        System.out.println("Less Than or Equal To (10 <= 5) = " + lessThanEqual);
    }
}